package com.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.userService.Entity.User;
import com.userService.Service.ServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private ServiceImpl serviceImpl;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable Integer id) {
		
		User user=this.serviceImpl.getUser(id);
		
		List contacts=this.restTemplate.getForObject("http://contact-service/contact/user/" + user.getUId(), List.class);
//		
		user.setContacts(contacts);
		
		return user;
	}
}
