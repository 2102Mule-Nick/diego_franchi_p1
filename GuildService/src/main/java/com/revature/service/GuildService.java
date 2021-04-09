package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.revature.jms.JMSMessageSender;
import com.revature.pojo.Guild;

@Service
public interface GuildService {
	
	public Guild getAllGuilds();
	
	public Guild getGuildByName(String guildName);
	
	public Guild createNewGuild(String guildName);
	
}
