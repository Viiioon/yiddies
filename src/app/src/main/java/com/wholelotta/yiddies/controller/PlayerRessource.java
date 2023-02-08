package com.wholelotta.yiddies.controller;

import com.wholelotta.yiddies.model.Player;
import com.wholelotta.yiddies.service.PlayersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerRessource {
    private final PlayersService playersService;

    public PlayerRessource(PlayersService playersService) {
        this.playersService = playersService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Player>> getAllPlayers() {
        List<Player> players = playersService.findAllPlayers();
        return new ResponseEntity<>(players, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Player> getPlayerById (@PathVariable("id") Long id) {
        Player player = playersService.findPlayerById(id);
        return new ResponseEntity<>(player, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Player> addPlayer (@RequestBody Player player) {
        Player newPlayer = playersService.addPlayer(player);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Player> updatePlayer (@RequestBody Player player) {
        Player newPlayer = playersService.updatePlayer(player);
        return new ResponseEntity<>(newPlayer, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Player> deletePlayer (@PathVariable("id") Long id) {
        playersService.deletePlayer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
