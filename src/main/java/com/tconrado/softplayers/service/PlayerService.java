package com.tconrado.softplayers.service;

import com.tconrado.softplayers.entity.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    List<Player> getAllPlayers();

    Player getPlayerById (Long id);

    List<Player> getPlayerByName (String name);

    Player createPlayer (Player player);

    Optional<Player> updatePlayer(Long id, Player player);

    void deletePlayer (Long id);
}
