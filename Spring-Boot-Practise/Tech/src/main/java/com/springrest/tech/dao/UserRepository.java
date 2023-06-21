package com.springrest.tech.dao;

import org.springframework.data.repository.CrudRepository;

import com.springrest.tech.Entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
