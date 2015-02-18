import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import loz.mechanics.Game;
import loz.mechanics.Profile;
import loz.mechanics.GameUtil;


public class LegendOfZeldaAttackOnHyrule {
	
	public static Scanner scan = new Scanner(System.in);
	private static Profile[] profiles = new Profile[3];
	private static boolean quitGame = false;
	private static boolean mainMenu = true;
	
	public static void main(String[] args){
		while(!quitGame){
			loadMainMenu();
			while(mainMenu){
				GameUtil.print("\nEnter a save to load or help: ");
				String command = scan.next();
				switch(command.toLowerCase()){
					case "1":
						loadSave(profiles[0], 1);
						profiles = null;
						break;
					case "2":
						loadSave(profiles[1], 2);
						profiles = null;
						break;
					case "3":
						loadSave(profiles[2], 3);
						profiles = null;
						break;
					case "help":
						GameUtil.println("\n~Available Commands~"
								+ "\n   1: Loads Save 1"
								+ "\n   2: Loads Save 2"
								+ "\n   3: Loads Save 3"
								+ "\n   Help: Lists commands"
								+ "\n   Quit: Quits game");
						break;
					case "quit":
						GameUtil.print("Thank you for playing!");
						quitGame = true;
						mainMenu = false;
						break;
				}
			}
		}
		System.exit(0);
	}
	
	/**
	 * Loads the main menu, this includes loading in profile information for save files or "New Game" for non-existent save files
	 */
	private static void loadMainMenu(){
		GameUtil.println("~~~~~~~~~~~~~~~~~~~~Legend of Zelda: Attack on Hyrule~~~~~~~~~~~~~~~~~~~~\n");
		for(int i = 0; i < 3; i++){
			GameUtil.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n~   Save " + (i + 1));
			if(new File("save" + (i + 1) + ".loz").exists() && !new File("save" + (i + 1) + ".loz").isDirectory()){
				profiles[i] = new Profile("save" + (i + 1) + ".loz");
				loadProfiles(profiles[i]);	
			}else{
				profiles[i] = new Profile();
				GameUtil.println("~   New Game");
			}
			GameUtil.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
	
	/**
	 * Initializes and loads in profile information for the main menu
	 * @param profile The profile you are attempting to load
	 */
	private static void loadProfiles(Profile profile){
		if(!profile.isNewProfile()){
			GameUtil.println("~   " + profile.player.getName());
			GameUtil.println("~   " + profile.player.totalHealthToString());
		}else{
			GameUtil.println("~   New Game");
		}
	}
	
	/**
	 * Loads profile info into the game
	 * @param profile Profile you would like to load
	 * @param profileNumber used if save doesn't exist to create a save with the proper number
	 */
	private static void loadSave(Profile profile, int profileNumber){
		if(!profile.isNewProfile()){
			new Game(profile.player);
		}else{
			GameUtil.print("Please enter your character's name:");
			newSave(scan.next(), profileNumber);
		}
	}
	
	/**
	 * Creates a new save file
	 * @param name Name of new character
	 * @param profileNumber number of profile you are creating save file for
	 */
	private static void newSave(String name, int profileNumber){
		try{
			File newSave = new File("save" + profileNumber + ".loz");
			newSave.createNewFile();
			BufferedWriter file = new BufferedWriter(new FileWriter(newSave), 32768);
			file.write("LOZ" + GameUtil.fileNewLine + 
						name + GameUtil.fileNewLine + 
						6 + GameUtil.fileNewLine + 
						6 + GameUtil.fileNewLine + 
						0 + GameUtil.fileNewLine + 
						0 + GameUtil.fileNewLine + 
						"Sword" + GameUtil.fileNewLine + 
						1 + GameUtil.fileNewLine + 
						0.15 + GameUtil.fileNewLine + 
						false + GameUtil.fileNewLine + 
						false + GameUtil.fileNewLine + 
						false);
			file.close();
		}catch(Exception e){}
	}
}
