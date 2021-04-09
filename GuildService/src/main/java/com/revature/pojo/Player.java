package com.revature.pojo;

public class Player {
	
	private int playerId;
	
	private String playerName;
	
	private int playerLevel;
	
	private String playerRace;
	
	private String playerClass;
	
	private String classSpecialization;
	
	private String playerFaction;
	
	private String playerProfession; 
	
	private String playerGuild;
	
	private String guildRole;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerLevel() {
		return playerLevel;
	}

	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}

	public String getPlayerRace() {
		return playerRace;
	}

	public void setPlayerRace(String playerRace) {
		this.playerRace = playerRace;
	}

	public String getPlayerClass() {
		return playerClass;
	}

	public void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}

	public String getClassSpecialization() {
		return classSpecialization;
	}

	public void setClassSpecialization(String classSpecialization) {
		this.classSpecialization = classSpecialization;
	}

	public String getPlayerFaction() {
		return playerFaction;
	}

	public void setPlayerFaction(String playerFaction) {
		this.playerFaction = playerFaction;
	}

	public String getPlayerProfession() {
		return playerProfession;
	}

	public void setPlayerProfession(String playerProfession) {
		this.playerProfession = playerProfession;
	}
	
	public String getPlayerGuild() {
		return playerGuild;
	}
	
	public void setPlayerGuild(String playerGuild) {
		this.playerGuild = playerGuild;
	}

	public String getGuildRole() {
		return guildRole;
	}

	public void setGuildRole(String guildRole) {
		this.guildRole = guildRole;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String playerName, int playerLevel, String playerRace, String playerClass,
			String classSpecialization, String playerFaction, String playerProfession, String playerGuild,
			String guildRole) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerLevel = playerLevel;
		this.playerRace = playerRace;
		this.playerClass = playerClass;
		this.classSpecialization = classSpecialization;
		this.playerFaction = playerFaction;
		this.playerProfession = playerProfession;
		this.playerGuild = playerGuild;
		this.guildRole = guildRole;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classSpecialization == null) ? 0 : classSpecialization.hashCode());
		result = prime * result + ((guildRole == null) ? 0 : guildRole.hashCode());
		result = prime * result + ((playerClass == null) ? 0 : playerClass.hashCode());
		result = prime * result + ((playerFaction == null) ? 0 : playerFaction.hashCode());
		result = prime * result + ((playerGuild == null) ? 0 : playerGuild.hashCode());
		result = prime * result + playerId;
		result = prime * result + playerLevel;
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + ((playerProfession == null) ? 0 : playerProfession.hashCode());
		result = prime * result + ((playerRace == null) ? 0 : playerRace.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (classSpecialization == null) {
			if (other.classSpecialization != null)
				return false;
		} else if (!classSpecialization.equals(other.classSpecialization))
			return false;
		if (guildRole == null) {
			if (other.guildRole != null)
				return false;
		} else if (!guildRole.equals(other.guildRole))
			return false;
		if (playerClass == null) {
			if (other.playerClass != null)
				return false;
		} else if (!playerClass.equals(other.playerClass))
			return false;
		if (playerFaction == null) {
			if (other.playerFaction != null)
				return false;
		} else if (!playerFaction.equals(other.playerFaction))
			return false;
		if (playerGuild == null) {
			if (other.playerGuild != null)
				return false;
		} else if (!playerGuild.equals(other.playerGuild))
			return false;
		if (playerId != other.playerId)
			return false;
		if (playerLevel != other.playerLevel)
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		if (playerProfession == null) {
			if (other.playerProfession != null)
				return false;
		} else if (!playerProfession.equals(other.playerProfession))
			return false;
		if (playerRace == null) {
			if (other.playerRace != null)
				return false;
		} else if (!playerRace.equals(other.playerRace))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerLevel=" + playerLevel
				+ ", playerRace=" + playerRace + ", playerClass=" + playerClass + ", classSpecialization="
				+ classSpecialization + ", playerFaction=" + playerFaction + ", playerProfession=" + playerProfession
				+ ", playerGuild=" + playerGuild + ", guildRole=" + guildRole + "]";
	}
	
}
