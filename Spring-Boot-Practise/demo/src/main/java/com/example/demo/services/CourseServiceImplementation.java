package com.example.demo.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.demo.Entities.Course;

@Service
public class CourseServiceImplementation implements CourseServices {

	List<Course> l;
	
	public CourseServiceImplementation() {
		l=new ArrayList();
		l.add(new Course(1, "Java", "details"));
		l.add(new Course(2, "Spring", "details"));
	}
	
	@Override
	public List<Course> getCourses() {
		return l;
	}
	
}
