package loz.mechanics;
import loz.entities.Enemy;
import loz.mechanics.Game;
import loz.entities.Player;

public class Battle {

	public Battle(Player player, Enemy enemy) {
		int rand = (int)(Math.random() * 1);
		String temp;
		while(player.isAlive() || enemy.isAlive()){
			System.out.println("Type help for commands");
			temp = Game.scan.next();
			if(rand == 0){
				//player will go first
				switch(temp){
				case "slash":
					System.out.println("Slashed!!!!");
					break;
				case "jab":
					System.out.println("You just got jabbed!!!!");
					break;
				case "upcut":
					System.out.println("Upper Cut!!!");
					break;
				case "hamer":
					System.out.println("you just got hammered ;)!!!");
					break;
				case "crit chance":
					//will produce a random # and if the number is with in crit chance it will do crit damage times 1.5 else will do nothing
					System.out.println("");
					break;
				default:
					System.out.println("invalid input;");
				}
			}
			else{
				//enemy will go first
				System.out.println("Type help for commands");
				temp = Game.scan.next();
				if(rand == 0){
					//player will go first
					switch(temp){
					case "slash":
						System.out.println("Slashed!!!!");
						break;
					case "jab":
						System.out.println("You just got jabbed!!!!");
						break;
					case "upcut":
						System.out.println("Upper Cut!!!");
						break;
					case "hamer":
						System.out.println("you just got hammered ;)!!!");
						break;
					case "crit chance":
						//will produce a random # and if the number is with in crit chance it will do crit damage times 1.5 else will do nothing
						System.out.println("");
						break;
					default:
						System.out.println("invalid input;");
					}
			}
		}
	}
	}
}