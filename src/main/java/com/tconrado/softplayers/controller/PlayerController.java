package com.tconrado.softplayers.controller;

import com.tconrado.softplayers.entity.Player;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlayerController {
    ResponseEntity<List<Player>> getAllPlayers();

    ResponseEntity<Player> getPlayerById(Long id);

    ResponseEntity<Player> createPlayer (Player player);

    ResponseEntity<Player> updatePlayer (Long id, Player player);

    ResponseEntity<Player> deletePlayer (Long id);
}
