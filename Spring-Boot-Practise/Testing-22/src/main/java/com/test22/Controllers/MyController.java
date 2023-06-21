package com.test22.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test22.Entities.Person;
import com.test22.Service.PersonServiceImplementation;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

@RestController
public class MyController {
	
	@Autowired
	PersonServiceImplementation service;
	
	@GetMapping("/home")
	public String home() {
		System.out.println("this is the home page in console");
		return "This is our home page.";
	}
	
	@GetMapping("/getById")
	public Person find2(@RequestParam Integer Id) {
		Person found=service.getById(Id);
		System.out.println("found person is : " + found);
		return found;
	}
	
	@GetMapping("/getById/{Id}")
	public Person findById(@PathVariable Integer Id) {
		Person found=service.getById(Id);
		System.out.println("found person is : " + found);
		return found;
	}
	
	@PostMapping("/add")
	public Person add(@RequestBody Person p) {
		Person addedPerson= service.saveData(p);
		System.out.println(addedPerson);
		return addedPerson;
	}
	
	@PutMapping("/update/{pId}")
	public Person update(@RequestBody Person p, @PathVariable Integer pId) {
		Person updatedPerson= service.updateData(p, pId);
		System.out.println(updatedPerson);
		return updatedPerson;
	}
	
	@DeleteMapping("/delete/{pId}")
	public String delete(@PathVariable Integer pId) {
		String str= service.deleteData(pId);
//		System.out.println(str);
		return str;
	}
	
}
