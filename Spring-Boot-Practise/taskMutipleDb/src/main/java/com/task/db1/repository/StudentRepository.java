package com.task.db1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.db1.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
