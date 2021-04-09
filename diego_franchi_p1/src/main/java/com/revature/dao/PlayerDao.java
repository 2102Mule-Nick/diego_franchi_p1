package com.revature.dao;

import java.util.List;

import com.revature.pojo.Player;

public interface PlayerDao {
	
	public Player createPlayer(Player player);
	
	public Player getPlayerById(int playerId);
	
	public Player getPlayerByName(String playerName);
	
	public List<Player> getAllPlayers();
	
	public Player updatePlayer(Player player, String field, String update);
	
	public void deletePlayer(Player player);

}
