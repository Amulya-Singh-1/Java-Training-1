package com.springrest.tech;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springrest.tech.Entities.User;
import com.springrest.tech.dao.UserRepository;
@SpringBootApplication
public class TechApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(TechApplication.class, args);
		
		UserRepository userRepo= context.getBean( UserRepository.class);
		User userData=new User();
		userData.setName("Amulya");
		userData.setCity("Delhi");
		userData.setStatus("nothing");
		
		User userData2 = new User();
		userData2.setName("Avar");
		userData2.setCity("Delhi");
		userData2.setStatus("new");
		
//		User user1= userRepo.save(userData);
		Iterable<User> it= List.of(userData, userData2);
		
		userRepo.saveAll(it);
//		System.out.println(user1);
		Optional<User> u= userRepo.findById(3);
		System.out.println(u);
		
	}

}
