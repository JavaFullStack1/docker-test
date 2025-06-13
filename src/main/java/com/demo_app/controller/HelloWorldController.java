package com.demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorldController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Hello World";
	}

}
