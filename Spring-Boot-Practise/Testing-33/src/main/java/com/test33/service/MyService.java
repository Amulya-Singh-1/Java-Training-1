package com.test33.service;

import com.test33.Entity.Player;
import com.test33.customException.BadInputException;
import com.test33.customException.EmptyInputException;

public interface MyService {

	Player addPlayer(Player p);

	Player getPlayer(Integer id);

	Player updatePlayer(Player p);

	String deletePlayer(Integer id);
}
