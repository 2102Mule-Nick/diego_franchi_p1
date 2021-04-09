package com.revature;

import java.util.Scanner;

import com.revature.ws.Guild;
import com.revature.ws.GuildService;
import com.revature.ws.GuildService_Service;
import com.revature.ws.Player;

public class GuildDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		GuildService_Service gs_s = new GuildService_Service();
		
		GuildService gsport = gs_s.getGuildServiceImplPort();
		
		System.out.println("Welcome to guildBuddy");
		System.out.println(" 1. Create New Guild");
		System.out.println(" 2. Search for Guild Roster");
		System.out.println(" 0. Exit");
		
		int input;
		
		do {
			input = scan.nextInt();
			switch (input) {
			case 1:
				scan.next();
				System.out.println("Please enter new guild name");
				gsport.createNewGuild(scan.nextLine());
				break;
			case 2:
				scan.next();
				System.out.println(" Please enter guild name");
				Guild guild = gsport.getGuildByName(scan.nextLine());
				
				if (guild != null) {
					System.out.println("Guild ID: " + guild.getGuildId());
					System.out.println("Guild Name: " + guild.getGuildName());
					System.out.println("Guild Leader: " + guild.getGuildLeader().getPlayerName());
					for (Player officer : guild.getGuildOfficers()) {
						System.out.println("Guild Officer: " + officer.getPlayerName());
					}
					for (Player member : guild.getGuildMembers()) {
						System.out.println("Guild Member: " + member.getPlayerName());
					}
				} else {
					System.out.println("Guild not found");
				}
			default:
				break;
			}

		} while (input != (0));
		
		System.out.println("Goodbye!");
		

	}

}
