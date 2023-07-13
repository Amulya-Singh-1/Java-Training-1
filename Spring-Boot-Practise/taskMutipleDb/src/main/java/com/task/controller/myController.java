package com.task.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.db1.dto.StudentDto;
import com.task.db1.entity.Student;
import com.task.db1.repository.StudentRepository;
import com.task.db2.dto.BookDto;
import com.task.db2.entity.Book;
import com.task.db2.repository.BookRepository;
import com.task.dto.CommonDto;
import com.task.service.serviceImplementation;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class myController {

	@Autowired private BookRepository bookRepository;

	@Autowired private StudentRepository studentRepository;

	@Autowired private serviceImplementation serviceImpl;

	@GetMapping("/home")
	@ApiOperation(notes = "home page of this service", value = "no parameter required for this api")
	public ResponseEntity<String> home(){
		System.out.println("Hii , I'm a home page.");
		return new ResponseEntity<>("Hii from home page", HttpStatus.ACCEPTED);
	}

	@GetMapping("/addData")
	@ApiOperation( notes = "add data statically" , value = "yea , no need to give parameters")
	public String add() {
		bookRepository.saveAll( Stream.of(new Book(1,"Java", 6000), new Book(2,"JavaScript",300)).collect(Collectors.toList()) );
		studentRepository.saveAll( Stream.of(new Student(11,"Tarun", 23), new Student(22,"Harshit", 23)).collect(Collectors.toList()) );
		return "data added successfully.";
	}

	@PostMapping("/addBook")
	@ApiOperation(notes = "add Book dynamically", value = "paas bookDto as parameter")
	public BookDto addBook(@ApiParam(value = "the json body of bookDto", required = true) @RequestBody BookDto dto) {
		Book save = bookRepository.save( serviceImpl.dtoToBook(dto) );
		return serviceImpl.bookToDto(save) ;
	}

	@PostMapping("/addStudent")
	public StudentDto addStudent(@RequestBody StudentDto dto) {
		Student save = studentRepository.save( serviceImpl.dtoToStudent(dto) );
		return serviceImpl.studentToDto(save) ;
	}

	@PostMapping("/commonsave")
	public CommonDto saveCommon(@RequestBody CommonDto commonDto) {
		Student student = new Student();
		Book book = new Book();
		BeanUtils.copyProperties(commonDto.getStudentDto(), student);
		BeanUtils.copyProperties(commonDto.getBookDto(), book);
		studentRepository.save(student);
		bookRepository.save(book);
		return commonDto;
	}

	@GetMapping("/getStudents")
	public List<StudentDto> getAllStudentsDto() {
		List<Student> listOfStudents=studentRepository.findAll();
		return serviceImpl.studentsToDto(listOfStudents);
	}

	@GetMapping("/getBooks")
	public List<BookDto> getBooksDto() {
		List<Book> listOfBooks= bookRepository.findAll();
		return serviceImpl.booksToDto(listOfBooks);
	}

}
