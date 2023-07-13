package com.demo.mappings.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mappings.Entity.Person;
import com.demo.mappings.service.serviceImpl;

@RestController
@RequestMapping("/person")
public class studentControllers {

	@Autowired 
	serviceImpl serviceImpl;
	
	@GetMapping("/get/{id}")
	public Person getPerson(@PathVariable Integer id) {
		return serviceImpl.getPerson(id);
	}
	
	@PostMapping("/add")
	public Person addPerson(@RequestBody Person p) {
		return serviceImpl.addPerson(p);
	}
	
}
