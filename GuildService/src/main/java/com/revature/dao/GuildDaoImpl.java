package com.revature.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.revature.dao.mapper.PlayerRowMapper;
import com.revature.pojo.Guild;
import com.revature.pojo.Player;

@Repository
public class GuildDaoImpl implements GuildDao {

	private JdbcTemplate jdbcTemplate;
	
	private PlayerRowMapper playerRowMapper;

	private SimpleJdbcInsert simpleJdbcInsert;
	
	private DataSource dataSource;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Autowired
	public void setPlayerRowMapper(PlayerRowMapper playerRowMapper) {
		this.playerRowMapper = playerRowMapper;
	}

	public void setSimpleJdbcInsert(SimpleJdbcInsert simpleJdbcInsert) {
		this.simpleJdbcInsert = simpleJdbcInsert;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public List<Guild> getGuildList() {
		String sql = "select * from guild ";
		return jdbcTemplate.query(sql, (rs, id) -> new Guild(rs.getInt("guild_id"), rs.getString("guild_name")));
	}
	
	@Override
	public Guild getGuildByName(String guildName) {
		String sql = "select * from guild where guild_name = ?";
		
		List<Guild> guildList = jdbcTemplate.query(sql,
				(rs, id) -> new Guild(rs.getInt("guild_id"), 
						rs.getString("guild_name")), guildName);
		
		if (guildList.size() > 0) {
			
			Guild guild = guildList.get(0);
			
			String sql2 = "select * from player where player_guild = ?";
			List<Player> guildRoster = jdbcTemplate.query(sql2, playerRowMapper, guild.getGuildName());
			List<Player> officerList = new ArrayList<>();
			List<Player> memberList = new ArrayList<>();
			
			for (Player player : guildRoster) {
				switch (player.getGuildRole()) {
				case "Guild Leader":
					guild.setGuildLeader(player);
					break;
				case "Officer":
					officerList.add(player);
					break;
				case "Member":
					memberList.add(player);
					break;
				default:
					break;
				}
			}
			
			guild.setGuildOfficers(officerList);
			guild.setGuildMembers(memberList);
			
			return guild;
		}
		
		return null;
	}

	@Override
	public Guild createGuild(String guildName) {
		
		if (simpleJdbcInsert == null) {
			simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
					.withTableName("guild")
					.usingGeneratedKeyColumns("guild_id");

		}
		
		Map<String, Object> fields = new HashMap<>();
		
		fields.put("guild_name", guildName);
		
		return new Guild((int)simpleJdbcInsert.executeAndReturnKey(fields), guildName);
	}

}
