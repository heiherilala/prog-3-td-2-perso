package com.HEI.prog3td2.controller.mapper;

import com.HEI.prog3td2.controller.response.MatchResponse;
import com.HEI.prog3td2.controller.response.TeamResponse;
import com.HEI.prog3td2.model.Match;
import com.HEI.prog3td2.model.Player;
import com.HEI.prog3td2.model.Team;
import com.HEI.prog3td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class MatchMapper {
    private final TeamMapper teamMapper;
    public MatchResponse toRest(Match domain) {
        return MatchResponse.builder()
                .id(domain.getId())
                .datetime(domain.getDatetime())
                .teamA(teamMapper.toRest(domain.getTeamA()))
                .teamB(teamMapper.toRest(domain.getTeamB()))
                .build();
    }
}
