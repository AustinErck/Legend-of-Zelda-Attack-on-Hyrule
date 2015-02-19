package loz.mechanics;

import loz.entities.Player;

public class Game {
	
	public Player player;
	/*private Location[][] map = new Location[2][2];
	private Location[] testLoc = {new Location("Wall", true),new Location("Wall", true),new Location("Wall", true),
								  new Location("Wall", true),new Location("Field", false),new Location("Wall", true),
	  							  new Location("Wall", true),new Location("Field", false),new Location("Wall", true)};*/
	//private String[] regionName = {"Forest", "Northern Hyrule Field", "Death Mountain", "West Hyrule Field", "Hyrule Field", "East Hyrule Field", "Lake Hylia", "Southern Hyrule Field", "Castle Town"};
	
	public Game(Player player){
		this.player = player;
	}	
}
