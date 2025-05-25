package com.infordevech.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infordevech.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
