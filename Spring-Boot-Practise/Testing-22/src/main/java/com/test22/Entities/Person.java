package com.test22.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int Id;
	private String Name;
	private String City;	
}
