package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.Guild;
import com.revature.service.GuildServiceImpl;

@RestController
public class GuildController {
	
	private GuildServiceImpl guildService;

	@Autowired
	public void setGuildService(GuildServiceImpl guildService) {
		this.guildService = guildService;
	}
	
	@GetMapping("/guild")
	public List<Guild> getAllGuilds() {
		return guildService.getAllGuilds();
	}
	
	@GetMapping("/guild/{guildName}")
	public Guild getGuildByName(@PathVariable String guildName) {
		return guildService.getGuildByName(guildName);
	}
	
	@PostMapping("/guild")
	public Guild createNewGuild(@RequestBody String guildName) {
		return guildService.createNewGuild(guildName);
	}

}
