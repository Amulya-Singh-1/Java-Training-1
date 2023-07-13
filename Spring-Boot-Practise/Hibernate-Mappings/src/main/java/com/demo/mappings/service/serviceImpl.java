package com.demo.mappings.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mappings.Entity.Laptop;
import com.demo.mappings.Entity.Person;
import com.demo.mappings.Repository.laptopRepository;
import com.demo.mappings.Repository.personRepository;

@Service
public class serviceImpl implements serviceInterface {

	@Autowired
	personRepository personRepo;

	@Autowired
	laptopRepository laptopRepo;

	@Override
	public Laptop getLaptop(Integer id) {
		Optional<Laptop> found = laptopRepo.findById(id);
		return found.get();
	}

	@Override
	public Laptop addLaptop(Laptop laptop) throws Exception {
		return laptopRepo.save(laptop);
	}

	@Override
	public Person getPerson(Integer id) {
		Optional<Person> found = personRepo.findById(id);
		return found.get();
	}

	@Override
	public Person addPerson(Person p) {
		Person save = personRepo.save(p);
		return save;
	}

}
