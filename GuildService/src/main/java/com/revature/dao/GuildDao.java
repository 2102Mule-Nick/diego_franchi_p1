package com.revature.dao;

import java.util.List;

import com.revature.pojo.Guild;

public interface GuildDao {
	
	public List<Guild> getGuildList();
	
	public Guild getGuildByName(String guildName);
	
	public Guild createGuild(String guildName);

}
