package com.demo.mappings.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mappings.Entity.Laptop;
import com.demo.mappings.Entity.Person;
import com.demo.mappings.dto.LaptopDto;
import com.demo.mappings.service.serviceImpl;

@RestController
@RequestMapping("/laptop")
public class laptopControllers {

	@Autowired
	serviceImpl serviceImpl;

	@GetMapping("/home")
	public String home() {
		return "this is the home page.";
	}

	@GetMapping("/get/{id}")
	public Laptop getLaptop(@PathVariable Integer id) {
		return serviceImpl.getLaptop(id);
	}

	@PostMapping("/add")
	public Laptop addLaptop(@RequestBody Laptop laptopDto) throws Exception {
		return serviceImpl.addLaptop(laptopDto);
	}

}
