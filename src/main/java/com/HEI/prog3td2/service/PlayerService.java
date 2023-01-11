package com.HEI.prog3td2.service;

import com.HEI.prog3td2.model.Player;
import com.HEI.prog3td2.model.Team;
import com.HEI.prog3td2.repository.PlayerRepository;
import com.HEI.prog3td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PlayerService {
    private final PlayerRepository playerRepository;
    public List<Player> getPlayers(){return playerRepository.findAll(); }
    public List<Player> getPlayersByIdTeam(int id){return playerRepository.findAllByTeamIdOrderByNumberAsc(id); }
}
