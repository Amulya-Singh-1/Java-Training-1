package com.demo.mappings.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
public class Laptop {
	@Id
	private Integer laptopId;
	private String laptopName;

	@ManyToMany(mappedBy = "laptops")
	private List<Person> person;

	// @ManyToOne
	// private Integer personId;

}
