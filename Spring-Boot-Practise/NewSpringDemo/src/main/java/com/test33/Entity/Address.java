package com.test33.Entity;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
	@NotNull(message = "hey your request has null as state")
	private String state;
	
	@NotNull(message = "hey your request has null as city")
	private String city;
	
	@NotNull(message = "hey your request has null as street")
	private String street;
}
