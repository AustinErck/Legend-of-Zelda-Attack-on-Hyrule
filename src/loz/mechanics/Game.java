package loz.mechanics;

import loz.entities.Player;
import loz.locations.Location;

public class Game {
	
	public Player player;
	public Location[][] map = new Location[29][29];
	
	public Game(Player player){
		this.player = player;
		loadMap();
	}
	
	private void loadMap(){
		
	}
}
