package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.GuildDao;
import com.revature.jms.JMSMessageSender;
import com.revature.pojo.Guild;
import com.revature.ws.GuildService;

@Service
public class GuildServiceImpl implements GuildService {
	
	private JMSMessageSender jMSMessageSender;
	
	private GuildDao guildDao;
	
	//@Autowired
	public void setjMSMessageSender(JMSMessageSender jMSMessageSender) {
		this.jMSMessageSender = jMSMessageSender;
	}
	
	@Autowired
	public void setGuildDao(GuildDao guildDao) {
		this.guildDao = guildDao;
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
