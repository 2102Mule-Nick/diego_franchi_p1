package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.PlayerDao;
import com.revature.pojo.Player;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	private PlayerDao playerDao;
	
	@Autowired
	public void setPlayerDao(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}

	@Override
	public List<Player> getAllPlayers() {
		return playerDao.getAllPlayers();
	}
	
	@Override
	public Player getPlayerByName(String playerName) {
		return playerDao.getPlayerByName(playerName);
	}

	@Override
	public Player createNewPlayer(Player player) {
		return playerDao.createPlayer(player);
	}

	@Override
	public List<Player> generateNewPlayer(int n) {
		return null;
	}

	

	

}
