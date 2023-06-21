package com.test.service;

import com.test.entity.Student;

public interface StudentService {

	Student saveStudentData(Student student);
	
	Student getStudentById(String id);
}