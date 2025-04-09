package kr.or.human99.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human99.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService service;
	
	// 게시판 페이지 들어오기
	@RequestMapping("/board")
	public String main(Model model) {
		
		List list = service.selectAllBoard();
		model.addAttribute("list", list);
		System.out.println("list :" + list);
		
		return "board";
	}
	
	// 글쓰기 페이지 가기
	@RequestMapping("write")
	public String write() {
		return "write";
	}
	
}
