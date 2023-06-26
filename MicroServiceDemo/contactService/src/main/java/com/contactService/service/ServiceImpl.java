package com.contactService.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contactService.entity.Contact;

@Service
public class ServiceImpl implements com.contactService.service.Service {

	List<Contact> contactList = List.of(
			new Contact( 2, "Ujjawal" , "uj@gmail.com", 11),
			new Contact( 4, "nite" , "uj@gmail.com", 12),
			new Contact( 5, "Ujj" , "uj@gmail.com", 14)
//			new Contact( 6, "lite" , "uj@gmail.com", 9)
	);
		
	@Override
	public List<Contact> getContactsOfUser(Integer uId) {
		return contactList.stream().filter( c -> c.getUId().equals(uId)).collect(Collectors.toList());
	}

}
