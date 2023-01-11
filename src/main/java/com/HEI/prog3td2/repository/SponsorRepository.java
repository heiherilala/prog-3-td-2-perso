package com.HEI.prog3td2.repository;

import com.HEI.prog3td2.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SponsorRepository extends JpaRepository<Sponsor, Integer> {
}
