package com.test33.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test33.Entity.Employee;
import com.test33.Entity.User;

@Repository
public interface MyRepository extends JpaRepository<Employee, Integer> {

}
