package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.revature.pojo.Player;

@Component
public class PlayerResultSetExtractor implements ResultSetExtractor<Player> {

	public Player extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		Player player = new Player();
		
		player.setPlayerId(rs.getInt("player_id"));
		player.setPlayerName(rs.getString("player_name"));
		player.setPlayerLevel(rs.getInt("player_level"));
		player.setPlayerRace(rs.getString("player_race"));
		player.setPlayerClass(rs.getString("player_class"));
		player.setClassSpecialization(rs.getString("player_spec"));
		player.setPlayerFaction(rs.getString("player_faction"));
		player.setPlayerProfession(rs.getString("player_prof"));
		player.setPlayerGuild(rs.getString("player_guild"));
		player.setGuildRole(rs.getString("player_role"));
		
		return player;
	}

}
