package com.HEI.prog3td2.controller.response;

import com.HEI.prog3td2.model.Player;
import com.HEI.prog3td2.model.Sponsor;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TeamResponse {
    private int id;
    private String name;
    private List<PlayerResponse> players;
    private List<Sponsor> sponsores;
}
