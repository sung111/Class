package kr.or.human3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	@RequestMapping("/ajax.do")
	public String ajax() {
		
		return "ajax";
	}
	
	
	@RequestMapping("/ajax1")
	public String ajax1(
//			json으로보낸건 @RequestParam 이나 request.getParameter로 받을수없다.
//			@RequestParam("id") // 생략가능
//			String id,
			
			@RequestBody
			MemberDTO dto
			
//			@RequestBody
//			String id
			) {
		
//		System.out.println("id :" + id);
		System.out.println("dto.id :" + dto.getId());
		
		return "ajax";
	}
	
	
	@RequestMapping("/ajax2")
	@ResponseBody
	public String ajax2(
			@RequestBody
			MemberDTO dto
			) {
		System.out.println("dto.id :" + dto.getId());
		
		return "ajax";
	}
	
	@RequestMapping("/ajax3")
	@ResponseBody
	public MemberDTO ajax3(
			@RequestBody
			MemberDTO dto
			) {
		System.out.println("dto.id :" + dto.getId());
		
		return dto;
	}
	
	@RequestMapping("/ajax4")
	@ResponseBody
	public List ajax4(
			@RequestBody
			MemberDTO dto
			) {
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		System.out.println("id :" + dto.getId());
		
		return list;
	}
	
	
	
}
