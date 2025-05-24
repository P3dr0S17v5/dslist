package com.infordevech.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infordevech.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
