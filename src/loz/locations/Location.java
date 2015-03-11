package loz.locations;

import loz.entities.Enemy;
import loz.entities.EnumEnemy;
import loz.entities.Player;
import loz.mechanics.Battle;
import loz.mechanics.Game;
import loz.mechanics.GameObject;
import loz.mechanics.GameUtil;

public class Location extends GameObject {

	private EnumLocation locationInfo;
	private int[] items = null;
	private Enemy[] enemies = null;

	/**
	 * Creates a new location in the game
	 * 
	 * @param locationInfo
	 *            Type of location the location is
	 */
	public Location(EnumLocation locationInfo) {
		super(locationInfo.getName(), locationInfo.getDesc());
		this.locationInfo = locationInfo;
	}

	/**
	 * Generates items in the current location on request and allows the player
	 * to pick them up
	 * 
	 * @param player
	 *            The current player
	 * @return
	 */
	public void lookForItems(Player player) {
		if (items == null) {
			items = new int[4];
			int[] genItems = {
					(int) (Math.random() * locationInfo.getItemRarity() * 10),
					(int) (Math.random() * locationInfo.getItemRarity() * 10),
					(int) (Math.random() * 1) };
			for (int i = 0; i < genItems.length; i++) {
				items[i] = genItems[i];
			}
		}
		GameUtil.println("You look on the ground around you and you find:");
		if (items[0] != 0) {
			if (items[0] == 1) {
				GameUtil.println("  A single rupee");
			} else {
				GameUtil.println("  " + items[0] + " rupees");
			}
		}
		if (items[1] != 0) {
			if (items[0] == 1) {
				GameUtil.println("  an arrow");
			} else {
				GameUtil.println("  " + items[1] + " arrows");
			}
		}
		if (items[2] != 0) {
			if (items[0] == 1) {
				GameUtil.println("  a heart");
			} else {
				GameUtil.println("  " + items[2] + " hearts");
			}
		}
		if (items[0] != 0 && items[1] != 0 && items[2] != 0) {
			GameUtil.println("  Nothing!");
		}
		GameUtil.print("Would you like to pick up all the items? ");
		if (Game.scan.next().toLowerCase().equals("yes")) {
			GameUtil.println("You pickup all the items");
			player.heal(items[0]);
			player.addRupees(items[1]);
			player.addArrows(items[2]);
			for (int i = 0; i < items.length; i++) {
				items[i] = 0;
			}
		} else {
			GameUtil.println("You decide to leave the items");
		}
	}

	public void lookForEnemies(Player player) {
		if (enemies == null) {
			enemies = new Enemy[2];
			for(int i = 0; i < 2; i++){
				Enemy tmp = null;
				int random = (int )(Math.random() * 6 + 1);
				switch(random){
				case 0:
				case 1:
					tmp = new Enemy(EnumEnemy.KEESE);
					break;
				case 2:
				case 3:
					tmp = new Enemy(EnumEnemy.CHUCHU);
					break;
				case 5:
				case 6:
					tmp = new Enemy(EnumEnemy.OCTOROK);
					break;
				case 7:
					tmp = new Enemy(EnumEnemy.BULBLIN);
					break;
				case 8:
					tmp = new Enemy(EnumEnemy.BOKOBLIN);
					break;
				case 9:
					tmp = new Enemy(EnumEnemy.STALFOS);
					break;
				default:
					tmp = new Enemy(EnumEnemy.KEESE);
				}
				enemies[i] = tmp;
			}
		}
		GameUtil.println("You look around and find two enemies\n   " + enemies[0].getName() + enemies[0].getHealthToString() + "\n   " + enemies[1].getName() + enemies[1].getHealthToString());
		GameUtil.print("Would you like to fight an enemy? ");
		if (Game.scan.next().toLowerCase().equals("yes")) {
			GameUtil.print("Which enemy? 1 or 2?");
			if(Game.scan.nextInt() == 1){
				new Battle(player, enemies[0]);
			}else{
				new Battle(player, enemies[1]);
			}
		} else {
			GameUtil.println("You decide to leave the items");
		}
	}

	/**
	 * Tests to see if the location is a wall
	 * 
	 * @return boolean representing if the location is a wall
	 */
	public boolean isAWall() {
		return locationInfo.isAWall();
	}

	/**
	 * Gets the current type of location, used for more advanced location
	 * actions such as items and enemies
	 * 
	 * @return
	 */
	public EnumLocation getEnumLocations() {
		return locationInfo;
	}
}
