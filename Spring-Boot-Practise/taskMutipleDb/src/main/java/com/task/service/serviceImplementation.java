package com.task.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.task.db1.dto.StudentDto;
import com.task.db1.entity.Student;
import com.task.db2.dto.BookDto;
import com.task.db2.entity.Book;

@Service
public class serviceImplementation implements ServiceInterface {

	@Override
	public Book dtoToBook(BookDto dto) {
		Book result=new Book();
		BeanUtils.copyProperties(dto, result, Book.class);
		return result;
	}

	@Override
	public BookDto bookToDto(Book book) {
		BookDto result=new BookDto();
		BeanUtils.copyProperties(book, result, BookDto.class);
		return result;
	}

	@Override
	public List<Book> dtoToBooks(List<BookDto> listOfDto) {
		List<Book> result=listOfDto.stream().map( i->dtoToBook(i) ).collect(Collectors.toList());
		return result;
	}

	@Override
	public List<BookDto> booksToDto(List<Book> listOfBooks) {
		List<BookDto> result=listOfBooks.stream().map( i->bookToDto(i) ).collect(Collectors.toList());
		return result;
	}

	@Override
	public StudentDto studentToDto(Student student) {
		StudentDto result=new StudentDto();
		BeanUtils.copyProperties(student, result, StudentDto.class);
		return result;
	}

	@Override
	public Student dtoToStudent(StudentDto dto) {
		Student result=new Student();
		BeanUtils.copyProperties(dto, result, Student.class);
		return result;
	}

	@Override
	public List<StudentDto> studentsToDto(List<Student> students) {
		List<StudentDto> result= students.stream().map( i->studentToDto(i) ).collect(Collectors.toList());
		return result;
	}

	@Override
	public List<Student> dtoToStudents(List<StudentDto> dto) {
		List<Student> result= dto.stream().map( i->dtoToStudent(i) ).collect(Collectors.toList());
		return result;
	}

}
