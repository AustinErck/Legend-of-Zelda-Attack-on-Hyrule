package loz.mechanics;

import loz.entities.Player;
import loz.locations.Location;
import loz.locations.Region;

public class Game {
	
	public Player player;
	public Region[][] map = new Region[2][2];
	
	public Game(Player player){
		this.player = player;
		loadMap();
	}
	
	private void loadMap(){
		
	}
}
