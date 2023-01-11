package com.HEI.prog3td2.service;

import com.HEI.prog3td2.model.Match;
import com.HEI.prog3td2.model.Player;
import com.HEI.prog3td2.repository.MatchRepository;
import com.HEI.prog3td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MatchService {
    private final MatchRepository matchRepository;
    public List<Match> getMatch(){return matchRepository.findAll(); }
}
