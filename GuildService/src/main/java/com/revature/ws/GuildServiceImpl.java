package com.revature.ws;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.dao.GuildDao;
import com.revature.jms.JMSMessageSender;
import com.revature.pojo.Guild;

@WebService(endpointInterface = "com.revature.ws.GuildService", serviceName = "guildService")
public class GuildServiceImpl implements GuildService {
	
	private GuildDao guildDao;
	
	private JMSMessageSender jMSMessageSender;

	@Autowired
	public void setGuildDao(GuildDao guildDao) {
		this.guildDao = guildDao;
	}
	
	//@Autowired
	public void setjMSMessageSender(JMSMessageSender jMSMessageSender) {
		this.jMSMessageSender = jMSMessageSender;
	}
	
	@Override
	public List<Guild> getAllGuilds() {
		return guildDao.getGuildList();
	}

	@Override
	public Guild getGuildByName(String guildName) {
		return guildDao.getGuildByName(guildName);
	}

	@Override
	public Guild createNewGuild(String guildName) {
		Guild guild = guildDao.createGuild(guildName);
		
		if (guild != null) {
			//jMSMessageSender.sendMessage("Welcome to new guild " + guildName);
		}
		
		return guild;
	}	

}
