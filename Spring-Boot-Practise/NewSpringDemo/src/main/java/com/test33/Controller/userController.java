package com.test33.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.test33.Service.MyUserDetailService;
import com.test33.customException.BadBodyFoundException;
import com.test33.customException.NoIdFoundException;
import com.test33.payload.UserDto;

public class userController {
	
	@Autowired
	private MyUserDetailService userService;

	@GetMapping("/getUser/{id}")
	public UserDto getUserById(@PathVariable Integer id) {
		if(id==null || id<0) { throw new NoIdFoundException("***** gaalt id mat daal"); }
		return userService.getUserById(id);
	}
	
	@PostMapping("/add")
	public UserDto addUser(@RequestBody UserDto userDto) {
		if(userDto==null) { throw new BadBodyFoundException(" ****** gaalt body mat daal");  }
		return userService.addUser(userDto);
	}
	
	@GetMapping("/getdto")
	public String getDto() throws JsonProcessingException {
		return userService.getDto();
	}
	
}
