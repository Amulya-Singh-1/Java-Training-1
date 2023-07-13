package com.demo.mappings.Entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
	private Integer rollNo;
	private String name;
	private Integer marks;
//	ONE-TO-MANY MAPPING
//	@OneToMany(targetEntity = Laptop.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "rollNo" , referencedColumnName = "rollNo")

//	MANY-TO-MANY MAPPING
	@ManyToMany
	@JoinTable(name = "person_laptop", joinColumns = { @JoinColumn(name = "pid") }, inverseJoinColumns = {
			@JoinColumn(name = "lid") })
	@JsonBackReference
	private List<Laptop> laptops;

}
