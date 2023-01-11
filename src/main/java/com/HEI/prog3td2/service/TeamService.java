package com.HEI.prog3td2.service;

import com.HEI.prog3td2.model.Team;
import com.HEI.prog3td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class TeamService {
    private TeamRepository teamRepository;
    public List<Team> getTeams(){return teamRepository.findAll(); }
}
