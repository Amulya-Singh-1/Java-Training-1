package com.test33.Entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull(message = "hey your request has null as name")
	@Pattern( regexp ="[a-zA-z]*", message = "name should be formed of alphabets only.")
	private String name;

	@NotNull(message = "hey your request has null as rollNo")
	@Pattern( regexp="\\d*", message = " rollNo should be formed of numbers only. ")
	private String rollNo;

	@Email(message = "hey your request has invalid email")
	@Pattern(regexp="\\w*+@gmail.com", message = "email should only be of Gmail.")
	private String email;

	@Embedded
	private Address address;

}
