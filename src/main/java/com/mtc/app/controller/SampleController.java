package com.mtc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping("/hello")
	public @ResponseBody String greet() {
		
		return "Spring MVC Annotation based";
	}
	
//	@RequestMapping("/hello")
//	public String greet(Model model) {
//		
//		model.addAttribute("message", "Spring MVC Annotation based");
//		
//		return "showMessage";
//	}
}
