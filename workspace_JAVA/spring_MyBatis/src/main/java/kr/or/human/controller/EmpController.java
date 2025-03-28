package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	
	@ResponseBody
	@RequestMapping(value="/emp",method=RequestMethod.GET)
	public List listEmp() {
		
		List list = empService.selectList();
		System.out.println(list.size());
		
		return list;
	}
	
	
	
	
}
