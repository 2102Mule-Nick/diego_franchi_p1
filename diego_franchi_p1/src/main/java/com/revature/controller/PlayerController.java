package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.Player;
import com.revature.service.PlayerService;

@RestController
public class PlayerController {
	
	private PlayerService playerService;

	@Autowired
	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}
	
	@GetMapping("/player")
	public List<Player> getAllPlayers() {
		return playerService.getAllPlayers();
	}
	
	@GetMapping("/player/{playerName}")
	public Player getPlayerByName(@PathVariable String playerName) {
		return playerService.getPlayerByName(playerName);
	}
	
	@PostMapping("/player")
	public Player createNewPlayer(@RequestBody Player player) {
		return playerService.createNewPlayer(player);
	}

}
