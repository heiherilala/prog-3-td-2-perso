package com.HEI.prog3td2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "play_against")
@Builder
@Data
public class Match {
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
