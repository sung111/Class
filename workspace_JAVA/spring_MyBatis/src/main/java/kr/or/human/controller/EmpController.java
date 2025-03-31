package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@RequestMapping(value="/emp",method=RequestMethod.GET)
	public String listEmp(Model model) {
		
		List list = empService.selectList();
		System.out.println(list.size());
		model.addAttribute("list", list);
		
		return "list";
	}
	
	@RequestMapping(value="/empOne",method=RequestMethod.GET)
	public String empOne() {
		
		EmpDTO dto = empService.getEmpOne();
		System.out.println("controller dot : " + dto);
		
		return "home";
	}
	@RequestMapping(value="/empno",method=RequestMethod.GET)
	public String empno(int a) {
		
		EmpDTO dto = empService.getEmpno(a);
		System.out.println("controller dot : " + dto);
		
		return "home";
	}
	
	@RequestMapping(value="/empno2",method=RequestMethod.GET)
	public String empno2(
			@ModelAttribute
			EmpDTO empDTO
		) {
		
		EmpDTO dto = empService.getEmpno2(empDTO);
		System.out.println("controller dot : " + dto);
		
		return "list";
	}
	
	
	
	
}
