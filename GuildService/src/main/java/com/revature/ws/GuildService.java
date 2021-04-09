package com.revature.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.revature.pojo.Guild;

@WebService
public interface GuildService {
	
	@WebMethod
	public List<Guild> getAllGuilds();

	@WebMethod
	public Guild getGuildByName(String guildName);
	
	@WebMethod
	public Guild createNewGuild(String guildName);
	
}
