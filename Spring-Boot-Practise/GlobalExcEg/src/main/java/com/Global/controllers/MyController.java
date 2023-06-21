package com.Global.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Global.Entities.Players;
import com.Global.services.MyServiceImpl;

@RestController
public class MyController {
	
	@Autowired
	MyServiceImpl serviceObj;
	
	@GetMapping("/get/{id}")
	public Players getPlayerById(@PathVariable Integer id) {
		return serviceObj.getPlayerById(id);
	}
}
