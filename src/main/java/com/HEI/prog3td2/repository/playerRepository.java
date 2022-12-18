package com.HEI.prog3td2.repository;

import com.HEI.prog3td2.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface playerRepository extends JpaRepository<Player, Integer> {
}
