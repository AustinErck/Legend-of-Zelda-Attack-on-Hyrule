package loz.mechanics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import loz.entities.Player;

public class GameUtil {

	public static String fileNewLine = System.getProperty("line.separator");

	/**
	 * Prints a line of text to the game window
	 * 
	 * @param text
	 *            Text you want printed
	 */
	public static void print(String text) {
		System.out.print(text);
	}

	/**
	 * Prints a line of text to the game window
	 * 
	 * @param text
	 *            Text you want printed
	 */
	public static void println(String text) {
		System.out.println(text);
	}

	/**
	 * Creates a new save file
	 * 
	 * @param name
	 *            Name of new character
	 * @param profileNumber
	 *            number of profile you are creating save file for
	 */
	public static void newSave(String name, int saveID) {
		try {
			File newSave = new File("save" + saveID + ".loz");
			newSave.createNewFile();
			BufferedWriter file = new BufferedWriter(new FileWriter(newSave),
					32768);
			file.write("Legend of Zelda: Attack on Hyrule Game Save File"
					+ GameUtil.fileNewLine + name + GameUtil.fileNewLine + 6
					+ GameUtil.fileNewLine + 6 + GameUtil.fileNewLine + 0
					+ GameUtil.fileNewLine + 0 + GameUtil.fileNewLine + saveID
					+ GameUtil.fileNewLine + "WOODEN_SWORD"
					+ GameUtil.fileNewLine + false + GameUtil.fileNewLine
					+ false + GameUtil.fileNewLine + false);
			file.close();
		} catch (Exception e) {
		}
	}

	/**
	 * Saves the current game state
	 * 
	 * @param player
	 */
	public static void saveGame(Player player) {
		try {
			File newSave = new File("save" + player.getSaveID() + ".loz");
			newSave.createNewFile();
			BufferedWriter file = new BufferedWriter(new FileWriter(newSave),
					32768);
			file.write("Legend of Zelda: Attack on Hyrule Game Save File"
					+ GameUtil.fileNewLine + player.getName()
					+ GameUtil.fileNewLine + player.getHealth()
					+ GameUtil.fileNewLine + player.getTotalHealth()
					+ GameUtil.fileNewLine + player.getArrows()
					+ GameUtil.fileNewLine + player.getRupees()
					+ GameUtil.fileNewLine + player.getSaveID()
					+ GameUtil.fileNewLine + player.getWeapon().getWeaponID()
					+ GameUtil.fileNewLine + player.getElements()[0]
					+ GameUtil.fileNewLine + player.getElements()[1]
					+ GameUtil.fileNewLine + player.getElements()[2]);
			file.close();
		} catch (Exception e) {
		}
	}

	public static void clear() {
		for (int c = 0; c < 500; ++c) {
			System.out.print("\b");
		}
	}
}
