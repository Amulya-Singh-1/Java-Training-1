package com.test33.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test33.customException.BadInputException;

@RestController
public class MyControllers {

	@GetMapping(value = "/home")
	public String home() {
		throw new BadInputException("hello in exception");
	}
}