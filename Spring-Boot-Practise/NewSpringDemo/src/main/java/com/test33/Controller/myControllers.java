package com.test33.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test33.Entity.Employee;
import com.test33.Service.ServiceImpl;
import com.test33.customException.NoEmployeeFoundException;
import com.test33.customException.NoIdFoundException;

@RestController
public class myControllers {
	@Autowired
	private ServiceImpl serviceObj;

	@GetMapping("/")
	public String home() {
		System.out.println("home page");
		return "this is our home page.";
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getEmployeeById(@Valid @PathVariable Integer id) {
		return new ResponseEntity<Employee>(serviceObj.getEmployeeById(id), HttpStatus.ACCEPTED);
	}

	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@Valid @RequestBody Employee e) {
		System.out.println(e);
		serviceObj.addEmployee(e);
		return new ResponseEntity<String>("The Employee has been added", HttpStatus.ACCEPTED);
	}

	@PutMapping("/put")
	public ResponseEntity<Employee> updateEmployee(@Valid @RequestBody  Employee e) {
		System.out.println("update api");
		if(e==null) { throw new NoEmployeeFoundException("No employee found in request body.");  }
		return new ResponseEntity<Employee>(serviceObj.updateEmployee(e), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable @Valid Integer id) {
		serviceObj.deleteEmployee(id);
		return new ResponseEntity<String>("The Employee has been deleted.", HttpStatus.ACCEPTED);
	}

}
