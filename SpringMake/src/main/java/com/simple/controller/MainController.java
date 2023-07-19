package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/test/aaa")
	public ModelAndView main() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("aaa");
		mv.addObject("data", "hello world");
		
		return mv;
	}
	
}
