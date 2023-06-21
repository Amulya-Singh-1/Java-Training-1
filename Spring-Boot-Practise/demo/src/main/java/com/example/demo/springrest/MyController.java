package com.example.demo.springrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Course;
import com.example.demo.services.CourseServices;

@RestController
public class MyController {
	
	@Autowired
	private CourseServices courseServices;
	
	@GetMapping("/home")
	public String home() {
		return "This is the home page.";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseServices.getCourses();
	}

}
