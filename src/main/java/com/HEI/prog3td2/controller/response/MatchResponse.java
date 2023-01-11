package com.HEI.prog3td2.controller.response;

import com.HEI.prog3td2.model.Sponsor;
import com.HEI.prog3td2.model.Team;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MatchResponse {
    private int id;
    private Instant datetime;
    private TeamResponse teamA;
    private TeamResponse teamB;
}
