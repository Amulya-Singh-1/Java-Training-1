package com.test22.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test22.Entities.Person;
import com.test22.Repositories.PersonRepo;

@Service
public class PersonServiceImplementation implements PersonService {
	
	@Autowired
	private PersonRepo personRepository;

	@Override
	public Person saveData(Person p) {
		Person savedPerson= personRepository.save(p);
		System.out.println(savedPerson);
		return savedPerson;
	}

	@Override
	public Person getById(Integer Id) {
		Optional<Person> foundPerson= personRepository.findById(Id);
		if(foundPerson.isPresent()) {
			System.out.println( "we found this person with id =" +Id + " : " + foundPerson);
			return foundPerson.get();
		}
		else {
			System.out.println("that object is not present !");
			return null;
		}
	}

	@Override
	public Person updateData(Person p,Integer Id) {
		Optional<Person> foundperson=personRepository.findById(Id);
		if(foundperson.isPresent()) {
			Person foundp=foundperson.get();
			foundp.setName(p.getName());
			foundp.setCity(p.getCity());
			personRepository.save(foundp);
			return foundp;
		}
		else {
			System.out.println("Invalid Id. Person Not found.");
			return null;
//			return Optional.empty();
		}
	}

	@Override
	public String deleteData(Integer Id) {
		if(personRepository.existsById(Id)) {
			personRepository.deleteById(Id);
			System.out.println(" the person with id : " + Id + " is deleted.");
			return " the person with id : " + Id + " is deleted.";
		}
		else {
			System.out.println("the person with id : " + Id + " is not present");
			return "the person with id : " + Id + " is not present";
		}
	}

}
