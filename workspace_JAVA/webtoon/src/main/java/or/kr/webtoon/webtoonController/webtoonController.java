package or.kr.webtoon.webtoonController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import or.kr.webtoon.webtoonService.webtoonService;

@Controller
public class webtoonController {

	@Autowired
	webtoonService webtoonService;

	@RequestMapping("/weblist")
	public ModelAndView list() {
		
		List list = webtoonService.selectList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		
		mav.setViewName("webtoon");
		
		return mav;
	}

	
	public String create() {
		
		return "s";
	}
	
}
