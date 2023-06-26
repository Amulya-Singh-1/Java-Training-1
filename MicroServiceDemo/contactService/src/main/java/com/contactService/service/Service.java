package com.contactService.service;

import java.util.List;

import com.contactService.entity.Contact;

public interface Service {
	public List<Contact> getContactsOfUser(Integer uId);
}
