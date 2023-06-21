package com.Global.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Global.Entities.Players;

@Repository
public interface MyRepository extends JpaRepository<Players, Integer> {

}
