package com.revature.pojo;

import java.util.List;

public class Guild {
	
	private int guildId;
	
	private String guildName;
	
	private Player guildLeader;
	
	private List<Player> guildOfficers;
	
	private List<Player> guildMembers;

	public int getGuildId() {
		return guildId;
	}

	public void setGuildId(int guildId) {
		this.guildId = guildId;
	}

	public String getGuildName() {
		return guildName;
	}

	public void setGuildName(String guildName) {
		this.guildName = guildName;
	}

	public Player getGuildLeader() {
		return guildLeader;
	}

	public void setGuildLeader(Player guildLeader) {
		this.guildLeader = guildLeader;
	}

	public List<Player> getGuildOfficers() {
		return guildOfficers;
	}

	public void setGuildOfficers(List<Player> guildOfficers) {
		this.guildOfficers = guildOfficers;
	}

	public List<Player> getGuildMembers() {
		return guildMembers;
	}

	public void setGuildMembers(List<Player> guildMembers) {
		this.guildMembers = guildMembers;
	}

	public Guild() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Guild(int guildId, String guildName, Player guildLeader, List<Player> guildOfficers,
			List<Player> guildMembers) {
		super();
		this.guildId = guildId;
		this.guildName = guildName;
		this.guildLeader = guildLeader;
		this.guildOfficers = guildOfficers;
		this.guildMembers = guildMembers;
	}

	public Guild(int guildId, String guildName) {
		super();
		this.guildId = guildId;
		this.guildName = guildName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + guildId;
		result = prime * result + ((guildLeader == null) ? 0 : guildLeader.hashCode());
		result = prime * result + ((guildMembers == null) ? 0 : guildMembers.hashCode());
		result = prime * result + ((guildName == null) ? 0 : guildName.hashCode());
		result = prime * result + ((guildOfficers == null) ? 0 : guildOfficers.hashCode());
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
		Guild other = (Guild) obj;
		if (guildId != other.guildId)
			return false;
		if (guildLeader == null) {
			if (other.guildLeader != null)
				return false;
		} else if (!guildLeader.equals(other.guildLeader))
			return false;
		if (guildMembers == null) {
			if (other.guildMembers != null)
				return false;
		} else if (!guildMembers.equals(other.guildMembers))
			return false;
		if (guildName == null) {
			if (other.guildName != null)
				return false;
		} else if (!guildName.equals(other.guildName))
			return false;
		if (guildOfficers == null) {
			if (other.guildOfficers != null)
				return false;
		} else if (!guildOfficers.equals(other.guildOfficers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Guild [guildId=" + guildId + ", guildName=" + guildName + ", guildLeader=" + guildLeader
				+ ", guildOfficers=" + guildOfficers + ", guildMembers=" + guildMembers + "]";
	}
	
	

}
