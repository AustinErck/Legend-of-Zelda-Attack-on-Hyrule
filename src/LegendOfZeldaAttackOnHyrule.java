import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import loz.entities.Player;
import loz.items.EnumWeapon;
import loz.items.Weapon;
import loz.mechanics.Game;
import loz.mechanics.GameUtil;

public class LegendOfZeldaAttackOnHyrule {

	public static Scanner scan = new Scanner(System.in);
	private static Player[] profile = new Player[3];
	private static boolean quitGame = false;

	public static void main(String[] args) {
		loadMainMenu();
		while (!quitGame) {
			GameUtil.print("\nPlease enter a command, type help: ");
			switch (scan.nextLine().toLowerCase()) {
			case "load 1":
				loadSave(profile[0], 1);
				break;
			case "load 2":
				loadSave(profile[1], 2);
				break;
			case "load 3":
				loadSave(profile[2], 3);
				break;
			case "help":
				GameUtil.println("\n~Available Commands~"
						+ "\n   Load #: Loads the save of that number EX: Load 1"
						+ "\n   Help: Lists commands" + "\n   Quit: Quits game");
				break;
			case "quit":
				GameUtil.print("Thank you for playing!");
				System.exit(0);
				break;
			default:
				GameUtil.println("Please enter a valid command\n");
				break;
			}
		}
	}

	/**
	 * Loads the main menu
	 */
	private static void loadMainMenu() {
		GameUtil.println("~~~~~~~~~~~~~~~~~~~~Legend of Zelda: Attack on Hyrule~~~~~~~~~~~~~~~~~~~~\n");
		for (int i = 0; i < 3; i++) {
			GameUtil.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n~   Save "
					+ (i + 1));
			if (new File("save" + (i + 1) + ".loz").exists() && !new File("save" + (i + 1) + ".loz").isDirectory()) {
				try {
					BufferedReader file = new BufferedReader(new FileReader("save" + (i + 1) + ".loz"));
					file.readLine();
					
					profile[i] = new Player(file.readLine(), 
							"the player", 
							Integer.parseInt(file.readLine()), 
							Integer.parseInt(file.readLine()), 
							Integer.parseInt(file.readLine()), 
							Integer.parseInt(file.readLine()), 
							Integer.parseInt(file.readLine()), 
							Integer.parseInt(file.readLine()), 
							Integer.parseInt(file.readLine()), 
							new Weapon(EnumWeapon.valueOf(file.readLine().toUpperCase())), 
							Boolean.parseBoolean(file.readLine()),
							Boolean.parseBoolean(file.readLine()),
							Boolean.parseBoolean(file.readLine()));


					file.close();
				} catch (Exception e) {}
				loadProfile(profile[i]);
			} else {
				profile[i] = new Player();
				GameUtil.println("~   New Game");
			}
			GameUtil.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}

	/**
	 * Initializes and loads in profile information for the main menu
	 * 
	 * @param profile
	 *            The profile you are attempting to load
	 */
	private static void loadProfile(Player player) {
		GameUtil.println("~   " + player.getName());
		GameUtil.println("~   " + player.totalHealthToString(player));
	}

	/**
	 * Loads profile info into the game
	 * 
	 * @param profile
	 *            Profile you would like to load
	 * @param profileNumber
	 *            used if save doesn't exist to create a save with the proper
	 *            number
	 */
	private static void loadSave(Player player, int saveID) {
		if (profile[saveID].isNewSave()) {
			new Game(player);
		} else {
			GameUtil.print("Please enter your characters name: ");
			GameUtil.newSave(scan.next(), saveID);
		}
	}
}
