package loz.mechanics;

import java.util.Scanner;

import loz.entities.Player;
import loz.locations.EnumLocations;
import loz.locations.Location;

public class Game {
	
	public Player player;
	private boolean playGame = true;
	Scanner scan = new Scanner(System.in);
	private Location[][] map = new Location[3][3];
	//private String[] regionName = {"Forest", "Northern Hyrule Field", "Death Mountain", "West Hyrule Field", "Hyrule Field", "East Hyrule Field", "Lake Hylia", "Southern Hyrule Field", "Castle Town"};
	
	public Game(Player player){
		this.player = player;
		loadMap();
		player.setXPos(1);
		player.setYPos(1);
		while(playGame){
			GameUtil.print("\nEnter an action: ");
			switch(scan.next().toLowerCase()){
				case "go":
					switch(scan.next().toLowerCase()){
						case "north":
							player.walk(0, map);
							break;
						case "east":
							player.walk(1, map);
							break;
						case "south":
							player.walk(2, map);
							break;
						case "west":
							player.walk(3, map);
							break;
						default:
							GameUtil.println("Please enter a valid command.");
							break;
					}
					break;
				case "look":
					switch(scan.next().toLowerCase()){
						case "for":
							switch(scan.next().toLowerCase()){
								case "items":
									player.lookForItems(map[player.getYPos()][player.getXPos()]);
									break;
								case "enemies":
									//TODO Allow user to fight enemies
									break;
								default:
									GameUtil.println("Please enter a valid command.");
									break;
							}
							break;
						default:
							GameUtil.println("Please enter a valid command.");
							break;
					}
					break;
				case "save":
					GameUtil.saveGame(player);
					break;
				case "save and quit":
				case "save quit":
					GameUtil.saveGame(player);
					playGame = false;
					System.exit(0);
					break;
				case "quit":
					playGame = false;
					System.exit(0);
					break;
				case "help":
					GameUtil.println("\n~Available Commands~"
							+ "\n   Go (direction): The player will walk in that direction Ex: go north"
							+ "\n   Search for items: The player will look for nearby items"
							+ "\n   Help: Lists commands"
							+ "\n   Save: Saves the game"
							+ "\n   Save and Quit: Saves then quits the game"
							+ "\n   Quit: Quits game");
					break;
				default:
					GameUtil.println("Please enter a valid command.");
					break;
			}
		}
	}
	
	public void loadMap(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(i == 1 && j == 1 || i == 2 && j == 1 || i == 0 && j == 1){
					map[i][j] = new Location(EnumLocations.PATH_FIELD);
				}else{
					map[i][j] = new Location(EnumLocations.WALL_FIELD);
				}
			}
		}
	}
}
