import java.io.File;
import java.util.Scanner;

import loz.mechanics.Profile;
import loz.mechanics.Text;


public class LegendOfZeldaAttackOnHyrule {
	
	public static Scanner scan = new Scanner(System.in);
;	private static Profile[] profiles = new Profile[3];
	private static boolean quitGame = false;
	
	public static void main(String[] args){
		while(!quitGame){
			loadMainMenu();
			Text.print("\nEnter a save to load or help: ");
			String command = scan.next();
			switch(command){
				case "1":
					break;
				case "2":
					break;
				case "3":
					break;
				case "help":
					break;
				case "quit":
					quitGame = true;
					break;
			}
		}
	}
	
	private static void loadMainMenu(){
		Text.println("~~~~~~~~~~~~~~~~~~~~Legend of Zelda: Attack on Hyrule~~~~~~~~~~~~~~~~~~~~\n");
		//Tests to see if a save file exists and loads the profiles to the home screen appropriately 
		for(int i = 0; i < 3; i++){
			Text.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n~   Save " + (i + 1));
			File file = new File("saves/save" + i + ".loz");
			if(file.exists() && !file.isDirectory()){
				profiles[i] = new Profile("saves/save" + i + ".loz");
				Text.println("~   " + profiles[i].player.getName());
				Text.println("~   " + profiles[i].player.toHealthString());
			}else{
				profiles[i] = new Profile();
				Text.println("~   New Game");
			}
			Text.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
}
