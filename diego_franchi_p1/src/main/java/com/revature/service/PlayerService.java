package com.revature.service;

import java.util.List;

import com.revature.pojo.Player;

public interface PlayerService {
	
	public List<Player> getAllPlayers();
	
	public Player getPlayerByName(String playerName);
	
	public Player createNewPlayer(Player player);
	
	public List<Player> generateNewPlayer(int n);

}
