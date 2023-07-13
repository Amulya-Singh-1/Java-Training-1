package com.test.startup;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.dto.StudentDto;
import com.test.entity.Student;
import com.test.repo.StudentRepository;

public class StartupUtility implements CommandLineRunner{

	@Value("${demo.json.string}")
	private String json;
	
	@Autowired
	private StudentRepository studentRepo;
	
//	public Student dtoToEntity(StudentDto dto) {
//		Student stud;
//		
//		return stud;
//	}
	
//	@Override
//	public void run(String... args) throws Exception {
//		ObjectMapper objMapper=new ObjectMapper();
//		ArrayList<StudentDto> list=new ArrayList<>();
//		StudentDto s1=new StudentDto(1, "Amulya", "cse");
//		StudentDto s2=new StudentDto(2, "Avar", "cse");
//		list.add(s1);
//		list.add(s2);
//		String jsonData=objMapper.writeValueAsString(list);
////		StudentDto value= objMapper.readValue( json, StudentDto.class);
////		StudentDto save= studentRepo.save(dtoToEntity(value));
//		System.out.println(jsonData);
//		
////		return jsonData;
//	}

}
