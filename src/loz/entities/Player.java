package loz.entities;

import loz.items.Weapon;
import loz.locations.Location;
import loz.mechanics.GameUtil;

public class Player extends Entity {

	private int arrows, rupees, xPos, yPos, regionXPos, regionYPos, saveID;
	private boolean newSave = true;
	private boolean[] elements = new boolean[3];

	/**
	 * Creates a player object
	 * 
	 * @param fileURL
	 */
	public Player(String name, int currentHealth, int totalHealth, int arrows,
			int rupees, int saveID, Weapon weapon, boolean forestElement,
			boolean fireElement, boolean waterElement) {
		super(name, "the player", totalHealth, currentHealth, weapon);
		this.arrows = arrows;
		this.rupees = rupees;
		this.regionXPos = 1;
		this.regionYPos = 0;
		this.xPos = 9;
		this.yPos = 8;
		this.saveID = saveID;
		this.elements[0] = forestElement;
		this.elements[1] = fireElement;
		this.elements[2] = waterElement;
		this.newSave = false;
	}

	/**
	 * Creates a player object that is a new game and not a playable player
	 */
	public Player() {
		super(null, null, 0, 0, null);
		newSave = true;
	}

	/**
	 * Moves the player in the specified direction
	 * 
	 * @param direction
	 *            Number representing the direction the player wants to go.
	 *            Clockwise staring with North equaling 0
	 * @param map
	 *            Current map the player is on
	 */
	public void walk(int direction, Location[][] map) {
		switch (direction) {
		case 0:
			if (getYPos() > 0 && !map[getYPos() - 1][getXPos()].isAWall()) {
				GameUtil.println("You walk north.");
				yPos--;
			} else {
				if (yPos != 0) {
					GameUtil.println("You can't, there is a "
							+ map[getYPos() - 1][getXPos()].getName()
									.toLowerCase() + " there.");
				} else {
					if(regionYPos != 0){
						GameUtil.println("You walk north.");
						regionYPos--;
						yPos = 9;
					}else{
						GameUtil.println("There seems to be a rocky hill that is too \nsteep to climb. Better go somewhere else");
					}
				}
			}
			break;
		case 1:
			if (getXPos() < map.length - 1
					&& !map[getYPos()][getXPos() + 1].isAWall()) {
				GameUtil.println("You walk east.");
				xPos++;
			} else {
				if (!(xPos == map.length - 1)) {
					GameUtil.println("You can't, there is a "
							+ map[getYPos()][getXPos() + 1].getName()
									.toLowerCase() + " there.");
				} else {
					if(regionXPos < 3){
						GameUtil.println("You walk east.");
						regionXPos++;
						xPos = 0;
					}else{
						GameUtil.println("There seems to be a rocky hill that is too \nsteep to climb. Better go somewhere else");
					}
				}
			}
			break;
		case 2:
			if (yPos < 9 && !map[yPos + 1][getXPos()].isAWall()) {
				GameUtil.println("You walk south.");
				yPos++;
			} else {
				if (!(yPos == 9)) {
					GameUtil.println("You can't, there is a "
							+ map[yPos + 1][getXPos()].getName()
									.toLowerCase() + " there.");
				} else {
					if(regionYPos < 2){
						GameUtil.println("You walk south.");
						regionYPos++;
						yPos = 0;
					}else{
						GameUtil.println("There seems to be a rocky hill that is too \nsteep to climb. Better go somewhere else");
					}
				}
			}
			break;
		case 3:
			if (getXPos() > 0 && !map[getYPos()][getXPos() - 1].isAWall()) {
				GameUtil.println("You walk west.");
				xPos--;
			} else {
				if (xPos != 0) {
					GameUtil.println("You can't, there is a "
							+ map[getYPos()][getXPos() - 1].getName()
									.toLowerCase() + " there.");
				} else {
					if(regionXPos != 0){
						GameUtil.println("You walk west.");
						regionXPos--;
						xPos = 9;
					}else{
						GameUtil.println("There seems to be a rocky hill that is too \nsteep to climb. Better go somewhere else");
					}
				}
			}
			break;
		}
	}

	public void lookAtInventory() {
		GameUtil.println("~ Inventory\n" + "   ~ " + this.getWeapon().getName()
				+ ": " + this.getWeapon().getDesc() + "\n" + "   ~ " + rupees
				+ " Rupees\n" + "   ~ " + arrows + " Arrows\n\n");
	}

	/**
	 * Returns the number of arrows the player has
	 * 
	 * @return The number of arrows
	 */
	public int getArrows() {
		return arrows;
	}

	/**
	 * Adds arrows to the players inventory
	 * 
	 * @param addedArrows
	 *            Number of arrows to add
	 */
	public void addArrows(int addedArrows) {
		rupees += addedArrows;
	}

	/**
	 * Returns the number of rupees the player has
	 * 
	 * @return The number of rupees
	 */
	public int getRupees() {
		return rupees;
	}

	/**
	 * Adds rupees to the player's inventory
	 * 
	 * @param addedRupees
	 *            The number of rupees to add
	 */
	public void addRupees(int addedRupees) {
		rupees += addedRupees;
	}

	/**
	 * Returns xPos of the current region the player is in
	 * 
	 * @return x position of region
	 */
	public int getRegionXPos() {
		return regionXPos;
	}
	
	/**
	 * Returns yPos of the current region the player is in
	 * 
	 * @return y position of region
	 */
	public int getRegionYPos() {
		return regionYPos;
	}
	
	/**
	 * Returns the x position the player is at
	 * 
	 * @return x position
	 */
	public int getXPos() {
		return xPos;
	}

	/**
	 * Returns the y position the player is ay
	 * 
	 * @return y position
	 */
	public int getYPos() {
		return yPos;
	}

	/**
	 * Returns save ID of the current player
	 * 
	 * @return Player save ID
	 */
	public int getSaveID() {
		return saveID;
	}

	/**
	 * Gets the array of the elements and if the player has earned them
	 * 
	 * @return Array elements in boolean form
	 */
	public boolean[] getElements() {
		return elements;
	}

	/**
	 * Returns true if the player is new, or did not have aprevious save
	 * 
	 * @return
	 */
	public boolean isNewSave() {
		return newSave;
	}

}
