package com.varxyz.jvx330.mvc.example1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoodbyeController {
	
	@RequestMapping("/example1/sayGoodbye")
	public ModelAndView sayGoodbye() {
		String greeting = "Goodbye!! 스프링 MVC";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("example1/goodbye");
		mav.addObject("greeting2", greeting);
		
		return mav;
	}
}
