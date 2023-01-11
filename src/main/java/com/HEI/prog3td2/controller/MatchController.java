package com.HEI.prog3td2.controller;

import com.HEI.prog3td2.controller.mapper.MatchMapper;
import com.HEI.prog3td2.controller.mapper.TeamMapper;
import com.HEI.prog3td2.controller.response.MatchResponse;
import com.HEI.prog3td2.controller.response.TeamResponse;
import com.HEI.prog3td2.service.MatchService;
import com.HEI.prog3td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {
    private final MatchService service;
    private final MatchMapper mapper;
    @GetMapping("/matchs")
    public List<MatchResponse> getBooks() {
        return service.getMatch().stream()
                .map(mapper::toRest)
                .toList();
    }

}
