package com.test22.Service;

import com.test22.Entities.Person;

public interface PersonService {
	Person getById(Integer Id);
	Person saveData(Person p);
	Person updateData(Person p, Integer Id);
	String deleteData(Integer Id);
}
