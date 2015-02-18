package loz.mechanics;

import java.util.Scanner;

import loz.entities.Player;
import loz.locations.Location;
import loz.locations.Region;

public class Game {
	
	public Player player;
	private boolean quitGame = false;
	private Location[][] map = new Location[2][2];
	private Location[] testLoc = {new Location("Wall", true),new Location("Wall", true),new Location("Wall", true),
								  new Location("Wall", true),new Location("Field", false),new Location("Wall", true),
	  							  new Location("Wall", true),new Location("Field", false),new Location("Wall", true)};
	//private String[] regionName = {"Forest", "Northern Hyrule Field", "Death Mountain",
	//								"West Hyrule Field", "Hyrule Field", "East Hyrule Field",
	//  							"Lake Hylia", "Southern Hyrule Field", "Castle Town"};
	
	public Game(Player player){
		this.player = player;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				map[i][j] = testLoc[(i*3)+j];
			}
		}
		while(!quitGame){
			switch(scan.next().toLowerCase()){
				case "north":
					if(player.getYPos() >= 0 && player.getXPos() >= 0 && !map[player.getYPos()+1][player.getXPos()].isWall()){
						player.move(0, map.length);
					}
					break;
				case "south":
					if(player.getYPos() < map.length && !map[player.getYPos()-1][player.getXPos()].isWall()){
						player.move(1, map.length);
					}
					break;
				case "east":
					if(player.getXPos() >= 0 && player.getXPos() >= 0 && !map[player.getYPos()][player.getXPos()-1].isWall()){
						player.move(2, map.length);
					}
					break;
				case "west":
					if(player.getXPos() < map.length && !map[player.getYPos()+1][player.getXPos()].isWall()){
						player.move(3, map.length);
					}
					break;
				case "look":
					break;
			}
		}
	}
	
	private void loadMap(){
		
	}
	
}
