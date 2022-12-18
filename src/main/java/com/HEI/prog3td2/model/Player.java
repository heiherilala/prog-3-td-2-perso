package com.HEI.prog3td2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "player")
@Builder
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 150)
    private String name;
    @Column(nullable = false)
    private int number;
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Team team;
}
