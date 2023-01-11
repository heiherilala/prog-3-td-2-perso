package com.HEI.prog3td2.controller.response;

import com.HEI.prog3td2.model.Player;
import com.HEI.prog3td2.model.Sponsor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PlayerResponse {
    private int id;
    private String name;
}
