package com.test.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
//	@Column(name = "student_name",length = 50)
	private String name;
	
	@OneToOne ( cascade = CascadeType.ALL)
	private Address address;
	
	@OneToMany (cascade = CascadeType.ALL)
	private List<Hobby> hobbies;
	
}