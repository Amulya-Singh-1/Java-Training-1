package com.test33.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test33.Entity.Player;
import com.test33.customException.BadInputException;
import com.test33.customException.EmptyInputException;
import com.test33.repository.MyRepository;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	MyRepository playerRepo;

	@Override
	public Player addPlayer(Player p) {
		if (p == null || p.getName().isEmpty() || p.getName().length() == 0) {
			throw new EmptyInputException("Please provide a player with proper credentials.");
		}
		playerRepo.save(p);
		return p;
	}

	@Override
	public Player getPlayer(Integer id) {
		Optional<Player> found = playerRepo.findById(id);
		if (found.isEmpty()) {   
			    
			throw new BadInputException("The provided input is not suitable.");
		}
		return found.get();
	}

	@Override
	public Player updatePlayer(Player p) {
		Optional<Player> found = playerRepo.findById(p.getId());
		if (found.isPresent()) {
			Player updatedPlayer = found.get();
			updatedPlayer.setName(p.getName());
			updatedPlayer.setSports(p.getSports());
			System.out.println("Yea the player is updated.");
			playerRepo.save(updatedPlayer);
			return updatedPlayer;
		}
		System.out.println("The Player with id : " + p.getId() + "doesn't exist !");
		return null;
	}

	@Override
	public String deletePlayer(Integer id) {
		if (playerRepo.existsById(id)) {
			playerRepo.deleteById(id);
			return "The player with id : " + id + " is deleted .";
		} else {
			System.out.println("The player with id : " + id + " was not found.");
			return null;
		}
	}

}
