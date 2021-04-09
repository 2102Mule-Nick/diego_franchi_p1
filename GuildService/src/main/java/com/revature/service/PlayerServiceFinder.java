package com.revature.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.pojo.Player;

@Service
public class PlayerServiceFinder implements PlayerService {
	
	private static final String url = "http://localhost:8080/diego_franchi_p1/player/";

	@Override
	public List<Player> getAllPlayers() {
		RestTemplate restTemplate = new RestTemplate();
		
		Player[] players = restTemplate.getForObject(url, Player[].class);
		
		return Arrays.asList(players);
	}

	@Override
	public Player getPlayerByName(String playerName) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		return restTemplate.getForObject(url + playerName, Player.class);
	}

	@Override
	public Player createNewPlayer(Player player) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		return restTemplate.postForObject(url, player, Player.class);
	}

}
