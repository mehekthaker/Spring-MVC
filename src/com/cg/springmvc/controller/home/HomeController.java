package com.cg.springmvc.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home.app") 
	public String home(){
		return "home";
	}

	
}
