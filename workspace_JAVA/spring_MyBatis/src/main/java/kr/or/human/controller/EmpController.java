package kr.or.human.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.human.dto.EmpDTO;
import kr.or.human.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;

	@RequestMapping("/home")
	public String hi(Model model) {

		List list = empService.selectList();

		model.addAttribute("list", list);

		return "kk";
	}

//	@ResponseBody
	@RequestMapping(value = "/emp1", method = RequestMethod.GET)
	public String listEmp(Model model, HttpServletRequest request) {

		List list = empService.selectList();
		System.out.println(list.size());
		model.addAttribute("list", list);
		// ip주소 가져오는 것 중 하나
		System.out.println("getRemoteAddr : " + request.getRemoteAddr());
		System.out.println("192.168.0.182".equals(request.getRemoteAddr()));
		if ("0:0:0:0:0:0:0:1".equals(request.getRemoteAddr())) {
			return "list";
		} else {
			// 접근 method 확인
			System.out.println("getMethod : " + request.getMethod());

			// 주소 전체. 단, 쿼리스트링 제외
			System.out.println("getRequestURL : " + request.getRequestURL());

			// ip, port, 쿼리스트링 제외한 주소
			System.out.println("getRequestURI : " + request.getRequestURI());

			// Context path; 프로젝트 구분하는 주소
			System.out.println("getContextPath : " + request.getContextPath());

			// Context path까지와 쿼리스트링 제외한 주소
			System.out.println("getServletPath : " + request.getServletPath());

			// 쿼리스트링만 가져오기
			System.out.println("getQueryString : " + request.getQueryString());

			return "hole";
		}
	}

	@RequestMapping(value = "/empOne", method = RequestMethod.GET)
	public String empOne() {

		EmpDTO dto = empService.getEmpOne();
		System.out.println("controller dto : " + dto);

		return "home";
	}

	@RequestMapping(value = "/empno", method = RequestMethod.GET)
	public String empno(int a) {

		EmpDTO dto = empService.getEmpno(a);
		System.out.println("controller dto : " + dto);

		return "home";
	}

	@RequestMapping(value = "/empno2", method = RequestMethod.GET)
	public String empno2(@ModelAttribute EmpDTO empDTO) {

		EmpDTO dto = empService.getEmpno2(empDTO);
		System.out.println("controller dto : " + dto);

		return "list";
	}

	@RequestMapping(value = "/resultt", method = RequestMethod.GET)
	public String result(@ModelAttribute EmpDTO empDTO, Model model) {
		EmpDTO dto = empService.getEmpno(empDTO.getEmpno());
		System.out.println("controller dtoooo : " + dto);

		model.addAttribute("dto", dto);

		return "result";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute EmpDTO empDTO, Model model) {
		int result = empService.setUpdate(empDTO);
		System.out.println("result : " + result);

		List list = empService.selectList();
		model.addAttribute("list", list);

		return "list";
	}

	@RequestMapping(value = "/insert")
	public String insert(Model model, EmpDTO empDTO) {
//		int result = empService.setInsert(empDTO);
//		System.out.println("result : " + result);
//		
//		List list = empService.selectList();
//		model.addAttribute("list", list);
//		
		return "made";
	}

	@RequestMapping(value = "/insert2")
	public String insert2(Model model, EmpDTO empDTO) {
		int result = empService.setInsert(empDTO);
		System.out.println("result : " + result);

		List list = empService.selectList();
		model.addAttribute("list", list);

		return "list";
	}

	@RequestMapping(value = "/emp")
	public String search(Model model, EmpDTO empDTO) {
		List list = empService.search(empDTO);
		System.out.println("result : " + list);

		model.addAttribute("list", list);
		model.addAttribute("empDTO", empDTO);

		return "list";
	}

}
