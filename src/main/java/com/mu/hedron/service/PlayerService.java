package com.mu.hedron.service;

import com.mu.hedron.dto.PlayerDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlayerService {
    ResponseEntity<PlayerDto> getPlayerById(int id);
    ResponseEntity<List<PlayerDto>> getAllPlayers();

    ResponseEntity<PlayerDto> addPlayer(PlayerDto newPlayer);
}
