package com.demo.mappings.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.mappings.Entity.Person;

public interface personRepository extends JpaRepository<Person, Integer> {

}
