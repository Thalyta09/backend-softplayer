package com.tconrado.softplayers.service.impl;

import com.tconrado.softplayers.entity.Player;
import com.tconrado.softplayers.repository.PlayerRepository;
import com.tconrado.softplayers.service.PlayerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    public final PlayerRepository repository;

    public PlayerServiceImpl(PlayerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Player> getAllPlayers() {
        List<Player> allPlayers = new ArrayList<>();
        repository.findAll().forEach(allPlayers::add);

        return allPlayers;
    }

    @Override
    public Player getPlayerById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Player createPlayer(Player user) {
        return repository.save(user);
    }

    @Override
    public Optional<Player> updatePlayer(Long id, Player player) {
        return repository.findById(id)
                .map(oldPlayer -> {
                    Player atlPlayer = oldPlayer.updateWith(player);
                    return repository.save(atlPlayer);
                });
    }

    @Override
    public void deletePlayer (Long id) {
        repository.deleteById(id);
    }

}
