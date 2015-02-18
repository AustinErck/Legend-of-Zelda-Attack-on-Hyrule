package loz.entities;

import loz.items.Weapon;

public class Player extends Entity{

	private String name;
	private int health;
	private int totalHealth;
	private int arrows;
	private int rupees;
	private int xPos;
	private int yPos;
	private Weapon weapon;
	private boolean isAlive;
	private boolean[] elements = new boolean[3];
	
	public Player(String name, int health, int totalHealth, int arrows, int rupees, Weapon weapon, boolean forestElement, boolean waterElement, boolean fireElement){
		this.name = name;
		this.health = health;
		this.totalHealth = totalHealth;
		this.arrows = arrows;
		this.rupees = rupees;
		this.weapon = weapon;
		isAlive = true;
		this.elements[0] = forestElement;
		this.elements[1] = waterElement;
		this.elements[2] = fireElement;
		this.xPos = 1;
		this.yPos = 1;
	}
	
	/**
	 * Updates applied to player after command
	 */
	@Override
	public void update() {
		// TODO Add update info
		if(!isAlive){
			
		}
	} 
	
	public void move(int direction, int posMax){
		switch(direction){
			case 0:
				if(yPos > 0){
					yPos--;
				}
				break;
			case 1:
				if(yPos < posMax){
					yPos++;
				}
				break;
			case 2:
				if(xPos > 0){
					xPos--;
				}
				break;
			case 3:
				if(xPos < posMax){
					xPos++;
				}
				break;
		}
	}
	
	/**
	 * Returns the players name
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Returns the players current health
	 */
	@Override
	public int getHealth() {
		return health;
	}

	/**
	 * Returns the total health of the player as a integer 
	 */
	@Override
	public int getTotalHealth() {
		return totalHealth;
	}

	/**
	 * Returns the players current weapon, used in battles for the game to calculate damage
	 */
	@Override
	public Weapon getWeapon() {
		return weapon;
	}
	
	/**
	 * Damages the player
	 * @param damage The amount of health points or half hearts you want to take away from the player
	 */
	public void damage(int damage){
		if(damage > health){
			
		}else{
			isAlive = false;
		}
	}
	
	/**
	 * Heals the player
	 * @param heal Health points or half heart you want to heal the player
	 */
	public void heal(int heal){
		if(heal + health <= totalHealth){
			health += heal;
		}else{
			health = totalHealth;
		}
	}
	
	/**
	 * Returns the number of rupees the player has
	 * @return The number of rupees 
	 */
	public int getRupees(){
		return rupees;
	}
	
	/**
	 * Returns the number of arrows the player has
	 * @return The number of arrows 
	 */
	public int getArrows(){
		return arrows;
	}
	
	/**
	 * Returns the x position the player is at
	 * @return x position 
	 */
	public int getXPos(){
		return xPos;
	}
	
	/**
	 * Returns the y position the player is ay
	 * @return y position 
	 */
	public int getYPos(){
		return yPos;
	}
	
	/**
	 * Outputs the players total health as a string of "<"s and "3"s
	 * @return A string of hearts representing the players total health
	 */
	public String totalHealthToString(){
		String output = "";
		for(int j = 0; j < getTotalHealth(); j++){
			if( j % 2 == 0){
				output += "<";
			}else{
				output += "3 ";
			}
		}
		return output;
	}

}
