package com.test33.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test33.Entity.Player;

@Repository
public interface MyRepository extends JpaRepository<Player, Integer> {
	
}
