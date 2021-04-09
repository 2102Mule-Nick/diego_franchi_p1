package com.revature.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.revature.dao.mapper.PlayerRowMapper;
import com.revature.pojo.Player;

@Repository
public class PlayerDaoImpl implements PlayerDao {

	private JdbcTemplate jdbcTemplate;
	
	private PlayerRowMapper playerRowMapper;
	
	private DataSource dataSource;
	
	private SimpleJdbcInsert simpleJdbcInsert;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Autowired
	public void setPlayerRowMapper(PlayerRowMapper playerRowMapper) {
		this.playerRowMapper = playerRowMapper;
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void setSimpleJdbcInsert(SimpleJdbcInsert simpleJdbcInsert) {
		this.simpleJdbcInsert = simpleJdbcInsert;
	}

	public Player createPlayer(Player player) {
		
		if (simpleJdbcInsert == null) {
			simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
					.withTableName("player")
					.usingGeneratedKeyColumns("player_id");

		}
		
		Map<String, Object> fields = new HashMap<>();
		
		fields.put("player_name", player.getPlayerName());
		fields.put("player_level", player.getPlayerLevel());
		fields.put("player_race", player.getPlayerRace());
		fields.put("player_class", player.getPlayerClass());
		fields.put("player_spec", player.getClassSpecialization());
		fields.put("player_faction", player.getPlayerFaction());
		fields.put("player_prof", player.getPlayerProfession());
		fields.put("player_guild", player.getPlayerGuild());
		fields.put("player_role", player.getGuildRole());
		
		player.setPlayerId(simpleJdbcInsert.executeAndReturnKey(fields).intValue());
		
		return player;
		
	}

	public Player getPlayerById(int playerId) {

		String sql = "select * from player where player_id = ?";
		
		return jdbcTemplate.query(sql, playerRowMapper, playerId).get(0);
		
	}

	public Player getPlayerByName(String playerName) {
		
		String sql = "select * from player where player_name = ?";
		
		return jdbcTemplate.query(sql, playerRowMapper, playerName).get(0);
		
	}

	public List<Player> getAllPlayers() {
		
		String sql = "select * from player";
		
		return jdbcTemplate.query(sql, playerRowMapper);
	}

	public Player updatePlayer(Player player, String field, String update) {

		String sql = "update player set ? = ? where player_name = ? ";
		
		jdbcTemplate.update(sql, field, update, player.getPlayerName());
		
		switch (field) {
		case "player_level":
			player.setPlayerLevel(Integer.valueOf(update));
			break;
		case "player_spec":
			player.setClassSpecialization(update);
			break;
		case "player_prof":
			player.setPlayerProfession(update);
			break;
		case "player_guild":
			player.setPlayerGuild(update);
			break;
		case "player_role":
			player.setGuildRole(update);
			break;
		default:
			break;
		}
	
		return player;
		
	}

	public void deletePlayer(Player player) {
		
		String sql = "delete from player where player_name = ?";
		
		jdbcTemplate.update(sql, player.getPlayerName());

	}

}
