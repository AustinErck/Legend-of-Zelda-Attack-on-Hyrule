package loz.mechanics;

import java.util.Scanner;

import loz.entities.Player;
import loz.items.Weapon;

public class Profile {
	
	public Player player;
	public boolean newSave = false;
	
	/**
	 * Loads save file from a URL into objects that can be passed to the game
	 * @param fileURL The url to a save file you are attempting to load
	 */
	public Profile(String fileURL){
		Scanner file = new Scanner(fileURL);
		player = new Player(file.next(), 
							Integer.parseInt(file.next()), 
							Integer.parseInt(file.next()), 
							Integer.parseInt(file.next()), 
							Integer.parseInt(file.next()), 
							new Weapon(file.next(), Integer.parseInt(file.next()), Integer.parseInt(file.next())), 
							Boolean.parseBoolean(file.next()), 
							Boolean.parseBoolean(file.next()), 
							Boolean.parseBoolean(file.next()));
		file.close();
	}
	
	/**
	 * Allows the main menu to display "New Game" because a save file doesn't exist
	 */
	public Profile(){
		newSave = true;
	}
}
