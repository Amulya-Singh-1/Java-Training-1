package com.test22.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test22.Entities.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
	
}
