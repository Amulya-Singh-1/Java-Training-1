package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Student;
import com.test.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping(path = "/hello")
	public String hello() {
		return "hello world";
	}

	@PostMapping("/save")
	Student saveStudent(@RequestBody Student student) {
	 	return service.saveStudentData(student);
	}
	
	
	
//	@GetMapping("/getById")
//	Student getStudent(@RequestParam(name = "x") Integer id) {
//		return service.getStudentById(id);
//	}
	
	@GetMapping("/getByPath/{x}")
	Student getStudentByPath(@PathVariable(name = "x") String name) {
		return service.getStudentById(name);
	}

}
