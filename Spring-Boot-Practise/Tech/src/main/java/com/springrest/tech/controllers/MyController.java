package com.springrest.tech.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "this is index page";
	}
}
