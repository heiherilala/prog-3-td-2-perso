package com.HEI.prog3td2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "play_against")
@Builder
public class PlayAgainst {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Instant datetime;
    private String stadium;
    @ManyToOne
    @JoinColumn(name = "team_a_id", nullable = false)
    private Team teamA;
    @ManyToOne
    @JoinColumn(name = "team_b_id", nullable = false)
    private Team teamB;
}
