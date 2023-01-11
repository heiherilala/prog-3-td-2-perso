package com.HEI.prog3td2.controller.mapper;

import com.HEI.prog3td2.controller.response.PlayerResponse;
import com.HEI.prog3td2.controller.response.TeamResponse;
import com.HEI.prog3td2.model.Player;
import com.HEI.prog3td2.model.Sponsor;
import com.HEI.prog3td2.model.Team;
import com.HEI.prog3td2.repository.PlayerRepository;
import com.HEI.prog3td2.repository.SponsorRepository;
import com.HEI.prog3td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class TeamMapper {
    private final PlayerService playerService;
    private final PlayerMapper playerMapper;
    public TeamResponse toRest(Team domain) {
        List<Player> players = playerService.getPlayersByIdTeam(domain.getId());
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .players(players.stream().map(playerMapper::toRest).toList())
                .sponsores(domain.getSponsors())
                .build();
    }
}
