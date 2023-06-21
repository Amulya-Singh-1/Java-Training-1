package com.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Student;
import com.test.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudentData(Student student) {
		Student save = studentRepository.save(student);
		System.out.println(save);
		return save;
	}

	@Override
	public Student getStudentById(String id) {
		Optional<Student> student = studentRepository.findName(id);
		if (student.isPresent()) {
			return student.get();
		}
		return new Student();
	}
}