package com.tconrado.softplayers.controller.impl;

import com.tconrado.softplayers.controller.PlayerController;
import com.tconrado.softplayers.entity.Player;
import com.tconrado.softplayers.service.PlayerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PlayerControllerImpl implements PlayerController {
    PlayerService service;

    public PlayerControllerImpl(PlayerService service) {
        this.service = service;
    }

    @Override
    @GetMapping("/api/player")
    public ResponseEntity<List<Player>> getAllPlayers() {
        return new ResponseEntity<>(service.getAllPlayers(), HttpStatus.OK);
    }

    @Override
    @GetMapping("/api/player/{id}")
    public ResponseEntity<Player> getPlayerById (@PathVariable Long id) {
        return new ResponseEntity<>(service.getPlayerById(id), HttpStatus.OK);
    }

    @Override
    @PostMapping("/api/player")
    public ResponseEntity<Player> createPlayer(@Valid @RequestBody Player player) {

        Player addPlayer = service.createPlayer(player);
        HttpHeaders HttpHeaders = new HttpHeaders();
        HttpHeaders.add("player","/api/player" + addPlayer.getId().toString());
        return new ResponseEntity<>(addPlayer, HttpHeaders, HttpStatus.CREATED);
    }

    @Override
    @PutMapping("/api/player/{id}")
    public ResponseEntity<Player> updatePlayer (@Valid @PathVariable("id") Long id, @RequestBody Player player) {

        service.updatePlayer(id, player);
        return new ResponseEntity<>(service.getPlayerById(id), HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/api/player/{id}")
    public ResponseEntity<Player> deletePlayer (@PathVariable("id") Long id) {
        service.deletePlayer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
