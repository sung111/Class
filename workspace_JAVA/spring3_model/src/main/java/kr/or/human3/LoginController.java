package kr.or.human3;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	// 로그인 페이지 표시
	@RequestMapping("/login.do")
	public ModelAndView LoginFor() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("result");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("id :" + id);
		System.out.println("pw : " + pw);
		
		request.setAttribute("id1", id);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("id2", id);
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		mav.addObject("dto", memberDTO);
		
		return mav;
		
	}
	@RequestMapping("/login2")
	public ModelAndView login2(
			// String id = request.getParameter("id") 와 같음
			// 기본적으로 필수값. 없다면 400 Bad Request 코드 발생
			// 즉, required = true 가 기본값이다.
			@RequestParam(value="id", required=false)
			String id,
			
			// parameter 의 key 와 변수명이같다면 @RequestParam 생략가능
			// @RequestParam(value="pw", required=false) 이게 생략됨
			String pw,
//			int 타입은 null 불가 (500 번대 오류)
//			java.lang.IllegalStateException: Optional int parameter 'a' is present but cannot be translated into a null value due to being declared as a primitive type. Consider declaring it as object wrapper for the corresponding primitive type.
//			int a
//			Map map,
			@RequestParam
			Map map
//			MemberDTO memberDTO
	) {
		
		
		System.out.println("id :" + id);
		System.out.println("pw :" + pw);
		System.out.println("map :" + map.get("id"));
//		System.out.println("map :" + map);
//		System.out.println("memberDTO :" + memberDTO);
		ModelAndView mav = new ModelAndView("result");
		return mav;
	}
	
	
	@RequestMapping("/login3")
	public ModelAndView login3(
			// 파라메터 에서 꺼내서
			// DTO에 알아서 넣어줌
			@ModelAttribute
			MemberDTO dto1,
			
			// dto를 자동으로채우고
			// model에 dto22 로 넣어줌. 아랫줄 생략가능. 
			// mav.addObject("dto22", dto2);
			@ModelAttribute("dto22")
			MemberDTO dto2,
			
			// DTO타입의 앞 글자만 소문자로 변경한 key로
			// 모델에 넣어줌
			//@ModelAttribute("memberDTO")
			MemberDTO dto3
			
		) {
		System.out.println("dto1 :" + dto1);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("dto11", dto1);
		
		return mav;
	}
	
	
}
