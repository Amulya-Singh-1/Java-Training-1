package com.test33.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDto {
	private Integer id;
	private String username;
	private String password;
}
