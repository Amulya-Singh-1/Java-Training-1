package com.task.dto;

import com.task.db1.dto.StudentDto;
import com.task.db2.dto.BookDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CommonDto {

	private StudentDto studentDto;
	private BookDto bookDto;
}
