package com.HEI.prog3td2.controller.mapper;

import com.HEI.prog3td2.controller.response.PlayerResponse;
import com.HEI.prog3td2.controller.response.TeamResponse;
import com.HEI.prog3td2.model.Player;
import com.HEI.prog3td2.model.Team;
import com.HEI.prog3td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PlayerMapper {

    public PlayerResponse toRest(Player domain) {
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }
}
