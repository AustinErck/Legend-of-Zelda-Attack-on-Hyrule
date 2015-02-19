import java.io.File;
import java.util.Scanner;

import loz.entities.Player;
import loz.mechanics.Game;
import loz.mechanics.GameUtil;


public class LegendOfZeldaAttackOnHyrule {
	
	public static Scanner scan = new Scanner(System.in);
	private static Player[] profile = new Player[3];
	private static boolean quitGame = false;
	
	public static void main(String[] args){
		loadMainMenu();
		while(!quitGame){
			GameUtil.print("\nPlease enter a command, type help: ");
			switch(scan.next().toLowerCase()){
				case "1":
					loadSave(profile[0], 1);
					break;
				case "2":
					loadSave(profile[1], 2);
					break;
				case "3":
					loadSave(profile[2], 3);
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
					break;
				default:
					GameUtil.println(" Please enter a valid command\n");
					break;
			}
			profile = null;
		}
		System.exit(0);
	}
	
	/**
	 * Loads the main menu
	 */
	private static void loadMainMenu(){
		GameUtil.println("~~~~~~~~~~~~~~~~~~~~Legend of Zelda: Attack on Hyrule~~~~~~~~~~~~~~~~~~~~\n");
		for(int i = 0; i < 3; i++){
			GameUtil.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n~   Save " + (i + 1));
			if(new File("save" + (i + 1) + ".loz").exists() && !new File("save" + (i + 1) + ".loz").isDirectory()){
				profile[i] = new Player("save" + (i + 1) + ".loz");
				loadProfile(profile[i]);	
			}else{
				profile[i] = new Player();
				GameUtil.println("~   New Game");
			}
			GameUtil.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
	
	/**
	 * Initializes and loads in profile information for the main menu
	 * @param profile The profile you are attempting to load
	 */
	private static void loadProfile(Player player){
		GameUtil.println("~   " + player.getName());
		GameUtil.println("~   " + player.totalHealthToString(player));
	}
	
	/**
	 * Loads profile info into the game
	 * @param profile Profile you would like to load
	 * @param profileNumber used if save doesn't exist to create a save with the proper number
	 */
	private static void loadSave(Player player, int saveID){
		if(!profile[saveID].getIsNewSave()){
			new Game(player);
		}else{
			GameUtil.print("Please enter your characters name: ");
			GameUtil.newSave(scan.next(), saveID);
		}
	}
}
