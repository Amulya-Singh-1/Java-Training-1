package com.test33.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test33.Entity.Player;
import com.test33.customException.BadInputException;
import com.test33.customException.EmptyInputException;
import com.test33.service.MyService;

@RestController
public class MyControllers {

	@Autowired
	MyService serviceObj;

	@GetMapping(value = "/home")
	public String home() {

		System.out.println("this is home page");
		return "This is home page";
	}

	@GetMapping("/get/{id}")
	public Player getPlayerById(@PathVariable Integer id) {
		return serviceObj.getPlayer(id);
	}

	@GetMapping("/get")
	public Player getPlayerById2(@RequestParam Integer id){
		return serviceObj.getPlayer(id);
	}

	@PostMapping("/add")
	public Player addPlayer(@RequestBody Player p) {
		return serviceObj.addPlayer(p);
	}

	@PutMapping("/update")
	public Player update(@RequestBody Player p) {
		return serviceObj.updatePlayer(p);
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return serviceObj.deletePlayer(id);
	}

}
