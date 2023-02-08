package com.wholelotta.yiddies.service;

import com.wholelotta.yiddies.exception.UserNotFoundException;
import com.wholelotta.yiddies.model.Player;
import com.wholelotta.yiddies.repository.PlayersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PlayersService {
    private final PlayersRepo playersRepo;

    @Autowired
    public PlayersService(PlayersRepo playersRepo) {
        this.playersRepo = playersRepo;
    }

    public Player addPlayer(Player player) {
        return playersRepo.save(player);
    }

    public List<Player> findAllPlayers() {
        return playersRepo.findAll();
    }

    public Player updatePlayer(Player player) {
        return playersRepo.save(player);
    }

    public void deletePlayer(Long playerId) {
        playersRepo.deletePlayerById(playerId);
    }

    public Player findPlayerById(Long playerId) {
        return playersRepo.findEmployeeById(playerId);
    }
}
