package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.revature.pojo.Player;

@Component
public class PlayerRowMapper implements RowMapper<Player> {
	
	private PlayerResultSetExtractor playerResultSetExtractor;
	
	@Autowired
	public void setPlayerResultSetExtractor(PlayerResultSetExtractor playerResultSetExtractor) {
		this.playerResultSetExtractor = playerResultSetExtractor;
	}

	public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
		return playerResultSetExtractor.extractData(rs);
	}

}
