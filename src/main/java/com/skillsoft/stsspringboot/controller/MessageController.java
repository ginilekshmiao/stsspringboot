package com.skillsoft.stsspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	@GetMapping("/")
	public String homepage() {
		return "homepage";
	}
	
	@GetMapping("/hello")
	public String helloMsg() {
		return "hellopage";
	}
	
	@GetMapping("/start")
	public String startMsg() {
		return "startpage";
	}


}
