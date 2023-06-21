package com.test33.ExceptionAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.test33.customException.NoEmployeeFoundException;
import com.test33.customException.NoIdFoundException;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RestControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {
	@ExceptionHandler(NoIdFoundException.class)
	public ResponseEntity<String> handleNoIdExcpetion(NoIdFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ClassNotFoundException.class)
	public ResponseEntity<String> handleClassNoFoundExcpetion(ClassNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoEmployeeFoundException.class)
	public ResponseEntity<String> handleNoEmployeeFoundException(NoEmployeeFoundException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}

//	@Override
//	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//		System.out.println("handleMethodArgumentNotValid came into play.");
//		List<String> m = new ArrayList<>();
//		ApiErrorResponse error = new ApiErrorResponse();
//		error.setHttpStatus(HttpStatus.BAD_REQUEST.value());
//		for(ObjectError er : ex.getAllErrors())
//			m.add(er.getDefaultMessage());			
//		error.setErrors(m);
//		return ResponseEntity.badRequest().body(error);
////		return super.handleMethodArgumentNotValid(ex.getMessage(), headers, status, request);
//	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException e,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		Map<String, String> responseMap = new HashMap<>();
		e.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			responseMap.put(fieldName, message);
//			System.out.println("hello");
		});
		return new ResponseEntity<>(responseMap, HttpStatus.BAD_REQUEST);
	}

//	@Getter
//	@Setter
//	@NoArgsConstructor
//	@AllArgsConstructor
//	static class ApiErrorResponse {
//		private Integer httpStatus;
//		private List<String> errors;
//	}
//	
}
