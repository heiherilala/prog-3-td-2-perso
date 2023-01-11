package com.HEI.prog3td2.repository;

import com.HEI.prog3td2.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
    List<Player> findAllByTeamIdOrderByNumberAsc(int id);
}
