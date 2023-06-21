package com.test.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
//	Optional<Student> findByName(String name);
	
	@Query(value = "select * from student where student_name=:n", nativeQuery = true)
	Optional<Student> findName(@Param("n") String name);
}