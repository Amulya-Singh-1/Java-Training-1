package com.contactService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contactService.entity.Contact;
import com.contactService.service.Service;

@RestController
@RequestMapping("contact")
public class contactController {
	
	@Autowired
	private Service contactService;
	
	@GetMapping("/user/{uId}")
	public List<Contact> getContacts(@PathVariable Integer uId){
		return this.contactService.getContactsOfUser(uId);
	}
}