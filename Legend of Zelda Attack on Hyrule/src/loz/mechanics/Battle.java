package loz.mechanics;
import loz.entities.Enemy;
import loz.mechanics.Game;
import loz.entities.Player;
import loz.items.Weapon;

public class Battle {

	public Battle(Player player, Enemy enemy) {
		int rand = (int)(Math.random() * 2);
		String temp;
		System.out.println("You begin to fight " + enemy.getName() + "\nType help for commands");
		while(player.isAlive() || enemy.isAlive()){
			if(rand == 0){
				temp = Game.scan.next();
				Weapon tmp = enemy.getWeapon();
				//player will go first
				switch(temp){
				case "slash":
					System.out.println("Slashed!!!!");
					enemy.damage((int)tmp.slash());
					rand = 1;
					break;
				case "jab":
					System.out.println("You just jabbed!!!!");
					enemy.damage((int)tmp.jab());
					rand = 1;
					break;
				case "uppercut":
					System.out.println("Upper Cut!!!");
					enemy.damage((int)tmp.upperCut());
					rand = 1;
					break;
				case "hammer":
					System.out.println("You just hammered ;)!!!");
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
					GameUtil.print("Comands: \n"
							+ "slash: Slashs the enemy\n"
							+ "jab: Jabs the enemy with your sword\n"
							+ "uppercut: swipes the sword up\n"
							+ "crit chance: you ether get a critical hit or miss\n"
							+ "size up: Gives you the enemies name and description");
					break;
				case "size up":
					GameUtil.print(enemy.getName() + " " + enemy.getDesc());
					break;
				default:
					System.out.println("Invalid input");
				}
			}
			else{
				Weapon tmp = enemy.getWeapon();
				//enemy will go first
				int tempory = (int)(Math.random() * 4);
				if(tempory == 0){
					temp = "slash";
				}
				else if(tempory == 1){
					temp = "jab";
				}
				else if(tempory == 2){
					temp = "uppercut";
				}
				else if(tempory == 3){
					temp = "hammer";
				}
				else{
					temp = "crit chance";
				}
				switch(temp){
				case "slash":
					System.out.println("You just got slashed!!!!");
					player.damage((int)tmp.slash());
					rand = 0;
					break;
				case "jab":
					System.out.println("You just got jabbed!!!!");
					player.damage((int)tmp.jab());
					rand = 0;
					break;
				case "uppercut":
					System.out.println("You just got upper cut!!!");
					player.damage((int)tmp.upperCut());
					rand = 0;
					break;
				case "hammer":
					System.out.println("You just got hammered ;)!!!");
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
					GameUtil.print("Comands: \n"
							+ "slash: Slashs the enemy\n"
							+ "jab: Jabs the enemy with your sword\n"
							+ "uppercut: swipes the sword up\n"
							+ "crit chance: you ether get a critical hit or miss\n"
							+ "size up: Gives you the enemies name and description");
					break;
				default:
					System.out.println("invalid input;");
				}
			}
		}
	}
}