package com.demo.mappings.service;

import com.demo.mappings.Entity.Laptop;
import com.demo.mappings.Entity.Person;

public interface serviceInterface {
	Laptop getLaptop(Integer id);

	Laptop addLaptop(Laptop laptopDto) throws Exception;

	Person getPerson(Integer id);

	Person addPerson(Person p);
}
