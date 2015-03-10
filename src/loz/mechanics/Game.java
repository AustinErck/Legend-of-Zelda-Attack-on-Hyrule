package loz.mechanics;

import java.util.Scanner;

import loz.entities.Player;
import loz.locations.EnumLocation;
import loz.locations.Location;
import loz.locations.MapGenerator;
import loz.locations.Region;

public class Game {

	public Player player;
	private boolean playGame = true;
	public static Scanner scan = new Scanner(System.in);
	private Region[][] map = new Region[3][3];

	private String[] regionName = {"Forest", "Northern Hyrule Field",
	"Death Mountain", "West Hyrule Field", "Hyrule Field",
	"East Hyrule Field", "Lake Hylia", "Southern Hyrule Field",
	"Castle Town"};

	public Game(Player player) {
		this.player = player;
		loadMap();
		player.setStartPosition(1, 1);
		while (playGame) {
			GameUtil.print("\nEnter an action: ");
			switch (scan.nextLine().toLowerCase()) {
			case "go north":
				player.walk(0, map[player.getRegionYPos()][player.getRegionXPos()].getRegionMap());
				break;
			case "go east":
				player.walk(1, map[player.getRegionYPos()][player.getRegionXPos()].getRegionMap());
				break;
			case "go south":
				player.walk(2, map[player.getRegionYPos()][player.getRegionXPos()].getRegionMap());
				break;
			case "go west":
				player.walk(3, map[player.getRegionYPos()][player.getRegionXPos()].getRegionMap());
				break;
			case "look for items":
				map[player.getRegionYPos()][player.getRegionYPos()].getLocationInfo(player.getXPos(), player.getYPos()).lookForItems(player);
				break;
			case "look for enemies":
				// TODO
				break;
			case "map":
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 3; j++){
						if(i == player.getRegionYPos() && j == player.getRegionXPos()){
							GameUtil.print("[*]");
						}else{
							GameUtil.print("[ ]");
						}
					}
					GameUtil.println("");
				}
				break;
			case "inventory":
				player.lookAtInventory();
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

	public void loadMap() {
		int tmp = 0;
		Region reg = null;
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[0].length; j++){
				switch(tmp){
				case 0:
					reg = new Region(regionName[tmp], MapGenerator.getForest());
					break;
				case 1:
					reg = new Region(regionName[tmp], MapGenerator.getFieldNorth());
					break;
				case 2:
					reg = new Region(regionName[tmp], MapGenerator.getLake());
					break;
				case 3:
					reg = new Region(regionName[tmp], MapGenerator.getFieldWest());
					break;
				case 4:
					reg = new Region(regionName[tmp], MapGenerator.getFieldMiddle());
					break;
				case 5:
					reg = new Region(regionName[tmp], MapGenerator.getFieldEast());
					break;
				case 6:
					reg = new Region(regionName[tmp], MapGenerator.getMountain());
					break;
				case 7:
					reg = new Region(regionName[tmp], MapGenerator.getFieldSouth());
					break;
				case 8:
					reg = new Region(regionName[tmp], MapGenerator.getCastle());
					break;
				}
				map[i][j] = reg;
				tmp++;
			}
		}
	}
}
