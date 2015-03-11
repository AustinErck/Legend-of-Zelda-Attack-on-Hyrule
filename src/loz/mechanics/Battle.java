package loz.mechanics;
import loz.entities.Enemy;
import loz.mechanics.Game;
import loz.entities.Player;
import loz.items.Weapon;

public class Battle {

	public Battle(Player player, Enemy enemy) {
		int rand = (int)(Math.random() * 2);
		String temp;
		while(player.isAlive() || enemy.isAlive()){
			System.out.print("\nEnter an action: ");
			temp = Game.scan.next();
			if(rand == 0){
				Weapon tmp = enemy.getWeapon();
				//player will go first
				switch(temp){
				case "slash":
					System.out.println("Slashed!!!!");
					enemy.damage((int)tmp.slash());
					rand = 1;
					break;
				case "jab":
					System.out.println("You just got jabbed!!!!");
					enemy.damage((int)tmp.jab());
					rand = 1;
					break;
				case "uppercut":
					System.out.println("Upper Cut!!!");
					enemy.damage((int)tmp.upperCut());
					rand = 1;
					break;
				case "hammer":
					System.out.println("you just got hammered ;)!!!");
					enemy.damage((int)tmp.hammer());
					rand = 1;
					break;
				case "crit chance":
					//will produce a random # and if the number is with in crit chance it will do crit damage times 1.5 else will do nothing
					System.out.println("");
					enemy.damage((int)tmp.criticalChance());
					rand = 1;
					break;
				case "help":
					GameUtil.print("this will print the commands out for battles");
					break;
				default:
					System.out.println("invalid input;");
				}
			}
			else{
				Weapon tmp = enemy.getWeapon();
				//enemy will go first
				switch(temp){
				case "slash":
					System.out.println("Slashed!!!!");
					player.damage((int)tmp.slash());
					rand = 0;
					break;
				case "jab":
					System.out.println("You just got jabbed!!!!");
					player.damage((int)tmp.jab());
					rand = 0;
					break;
				case "uppercut":
					System.out.println("Upper Cut!!!");
					player.damage((int)tmp.upperCut());
					rand = 0;
					break;
				case "hammer":
					System.out.println("you just got hammered ;)!!!");
					player.damage((int)tmp.hammer());
					rand = 0;
					break;
				case "crit chance":
					//will produce a random # and if the number is with in crit chance it will do crit damage times 1.5 else will do nothing
					System.out.println("");
					player.damage((int)tmp.criticalChance());
					rand = 0;
					break;
				case "help":
					GameUtil.print("this will print the commands out for battles");
					break;
				default:
					System.out.println("invalid input;");
				}
			}
		}
	}
}