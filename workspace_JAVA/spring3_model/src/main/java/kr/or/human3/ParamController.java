package kr.or.human3;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ui")
public class ParamController {
	
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
	
	@RequestMapping("/login4")
	public String login4() {
		return "result";
	}
	@RequestMapping("/login5")
	public String login5() {
		return "redirect:login.do"; // redirect는 두번째주소를 보여줌
	}
	@RequestMapping("/login5_1")
	public String login5_1() {
		return "forward:login.do"; // forward는 주소를 유지해주면서 화면을 전환시켜줌
	}
	@RequestMapping("/login6")
	public String login6( Model model ) {
		
		model.addAttribute("id1","model");
		
		return "result";
	}
	
//	@RequestMapping("/result")
	@RequestMapping("/result.human")
	public void login7() {
		// 리턴타입이 void 또는 리턴값이 null 일때
		// @RequestMapping의 주소 중 마지막 쩜 앞의 글씨를
		// ViewResolver로 보냄
		System.out.println("login7실행");
	}
	@RequestMapping("/login8/{id}")
	public String login8(
			@PathVariable("id")
			String id
	) {
		System.out.println("id :" + id);
		return "result";
		
	}
	@RequestMapping("/login9/{maonth}/add/{day}")
	public String login9(
			@PathVariable("maonth") // 생략 불가능
			String m,
			@PathVariable("day")
			int d
			) {
		System.out.println("maonth :" + m);
		System.out.println("day :" + d);
		
		return "result";
	}
	@RequestMapping("/login10")
	public String login10() {
		
		return "result";
	}
	@RequestMapping(value="/login11", method=RequestMethod.GET)
	public String login11() {
		
		return "result";
	}
	//두개 사용하는방법
	@RequestMapping(value="/login12", method={RequestMethod.GET, RequestMethod.POST})
	public String login12() {
		
		return "result";
	}
	
	// 주소를 두개이상 사용하는 방법
	@RequestMapping(value={"/login13", "/login14"})
	public String login13() {
		System.out.println("13 or 14");
		return "result";
	}
	@RequestMapping(value={"/login15"}, method=RequestMethod.GET)
	public String login15() {
		System.out.println("15에 get");
		return "result";
	}
	@RequestMapping(value={"/login15"}, method=RequestMethod.POST)
	public String login15_1() {
		System.out.println("15에 POST");
		return "result";
	}
	@RequestMapping(value={"/login16"})
	public String login16_1() {
		System.out.println("15에 POST");
		return "result";
	}
//	@RequestMapping(value={"/login16"})
//	public String login16_2() {
//		System.out.println("15에 POST");
//		return "result";
//	}
	
	
	
	
}
