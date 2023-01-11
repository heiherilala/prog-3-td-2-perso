package com.HEI.prog3td2.controller;

import com.HEI.prog3td2.controller.mapper.TeamMapper;
import com.HEI.prog3td2.controller.response.TeamResponse;
import com.HEI.prog3td2.model.Match;
import com.HEI.prog3td2.model.Player;
import com.HEI.prog3td2.model.Sponsor;
import com.HEI.prog3td2.model.Team;
import com.HEI.prog3td2.repository.MatchRepository;
import com.HEI.prog3td2.repository.PlayerRepository;
import com.HEI.prog3td2.repository.SponsorRepository;
import com.HEI.prog3td2.repository.TeamRepository;
import com.HEI.prog3td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    private final TeamMapper mapper;
    @GetMapping("/teams")
    public List<TeamResponse> getBooks() {
        return service.getTeams().stream()
                .map(mapper::toRest)
                .toList();
    }

}
