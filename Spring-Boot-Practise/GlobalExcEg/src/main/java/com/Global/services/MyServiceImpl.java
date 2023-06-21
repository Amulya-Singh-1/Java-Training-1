package com.Global.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Global.Entities.Players;
import com.Global.customExceptions.NoNameFoundException;
import com.Global.repository.MyRepository;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	MyRepository myRepo;
	
	@Override
	public Players getPlayerById(Integer id) {
		Optional<Players> idOpt=myRepo.findById(id);
		if(idOpt.isEmpty()) { 
			throw new NoNameFoundException("No name found in the input !!");
		}
		return idOpt.get();
	}

}
