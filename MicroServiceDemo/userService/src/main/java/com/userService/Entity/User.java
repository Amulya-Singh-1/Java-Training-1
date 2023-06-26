package com.userService.Entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	private Integer uId;
	private String name;
	private String phone;
	
	List<Contact> contacts=new ArrayList<>();

	public User(Integer uId, String name, String phone) {
		super();
		this.uId = uId;
		this.name = name;
		this.phone = phone;
	}
	
}
