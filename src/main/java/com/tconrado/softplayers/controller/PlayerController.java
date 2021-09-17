package com.tconrado.softplayers.controller;

import com.tconrado.softplayers.entity.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.List;

public interface PlayerController {
    ResponseEntity<List<Player>> getAllPlayers();

    ResponseEntity<Player> getPlayerById(Long id);

    ResponseEntity<Player> createPlayer (@Valid Player player);

    ResponseEntity<Player> updatePlayer (@Valid Long id, Player player);

    ResponseEntity<Player> deletePlayer (Long id);
}
