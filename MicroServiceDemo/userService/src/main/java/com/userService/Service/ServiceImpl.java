package com.userService.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.userService.Entity.User;

@Service
public class ServiceImpl implements com.userService.Service.Service{

	List<User> userList=List.of(
			new User(11, "Amulya", "204432890"), 
			new User(12, "Avar", "240941282"),
			new User(14, "Tarun", "234098342")
	);
	
	@Override
	public User getUser(Integer id) {	
		return this.userList.stream().filter( u-> u.getUId().equals(id)).findAny().orElse(null);
	}


}
