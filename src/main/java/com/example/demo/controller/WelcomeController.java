package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello modified, Welcome to Spring boot..";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi modified, Welcome to Spring boot";
	}

}
