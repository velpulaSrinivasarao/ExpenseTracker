package com.mvc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Samplecontroller {

	
	@RequestMapping("/display")
	@ResponseBody
	public String displayMessage() {
		
		return "<center><h1>This is Spring boot MVC Project</h1></center>";
	}
	
	@RequestMapping("/demo")
	public String demo() {
		
		return "Demo";
	}
}
