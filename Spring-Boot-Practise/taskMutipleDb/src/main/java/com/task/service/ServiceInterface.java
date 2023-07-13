package com.task.service;

import java.util.List;

import com.task.db1.dto.StudentDto;
import com.task.db1.entity.Student;
import com.task.db2.dto.BookDto;
import com.task.db2.entity.Book;

//@Service
public interface ServiceInterface {
	Book dtoToBook(BookDto dto);
	BookDto bookToDto(Book book);
	List<Book> dtoToBooks(List<BookDto> listOfDto);
	List<BookDto> booksToDto(List<Book> listOfBooks);

	StudentDto studentToDto(Student student);
	Student dtoToStudent(StudentDto dto);
	List<StudentDto> studentsToDto(List<Student> students);
	List<Student> dtoToStudents(List<StudentDto> dto);

}
