package loz.mechanics;

import java.io.BufferedReader;
import java.io.FileReader;

import loz.entities.Player;
import loz.items.Weapon;

public class Profile {
	
	public Player player;
	public boolean newProfile;
	
	/**
	 * Loads save file from a URL into objects that can be passed to the game
	 * @param fileURL The url to a save file you are attempting to load
	 */
	public Profile(String fileURL){
		try{
		newProfile = false;
		BufferedReader file = new BufferedReader(new FileReader(fileURL));
		file.readLine();
		player = new Player(file.readLine(), 
							Integer.parseInt(file.readLine()), 
							Integer.parseInt(file.readLine()), 
							Integer.parseInt(file.readLine()), 
							Integer.parseInt(file.readLine()), 
							new Weapon(file.readLine(), Integer.parseInt(file.readLine()), Double.parseDouble(file.readLine())), 
							Boolean.parseBoolean(file.readLine()), 
							Boolean.parseBoolean(file.readLine()), 
							Boolean.parseBoolean(file.readLine()));
		file.close();
		}catch(Exception e){
			
		}
	}
	
	/**
	 * Allows the main menu to display "New Game" because a save file doesn't exist
	 */
	public Profile(){
		newProfile = true;
	}
	
	/**
	 * Gets the current state of newProfile
	 * @return true if the profile is new
	 */
	public boolean isNewProfile(){
		return newProfile;
	}
}
