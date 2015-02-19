package loz.entities;

import java.io.BufferedReader;
import java.io.FileReader;

import loz.items.Weapon;

public class Player extends Entity{

	private String name;
	private int health, totalHealth, arrows, rupees, xPos, yPos, saveID;
	private Weapon weapon;
	private boolean isAlive, newSave;
	private boolean[] elements = new boolean[3];
	
	/**
	 * Creates a player object
	 * @param fileURL URL of save file
	 */
	public Player(String fileURL){
		try{
			BufferedReader file = new BufferedReader(new FileReader(fileURL));
			file.readLine();
			
			name = file.readLine();
			health = Integer.parseInt(file.readLine());
			totalHealth = Integer.parseInt(file.readLine());
			arrows = Integer.parseInt(file.readLine());
			rupees = Integer.parseInt(file.readLine());
			xPos = 0;
			yPos = 0;
			saveID = Integer.parseInt(file.readLine());
			weapon = new Weapon(file.readLine(), file.readLine(), Integer.parseInt(file.readLine()), Double.parseDouble(file.readLine()));
			elements[0] = Boolean.parseBoolean(file.readLine());
			elements[1] = Boolean.parseBoolean(file.readLine());
			elements[2] = Boolean.parseBoolean(file.readLine());
			
			file.close();
			}catch(Exception e){}
	}
	
	public Player(){
		newSave = true;
	}
	
	@Override
	public void update() {
		// TODO Add update info
		if(!isAlive){
			
		}
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
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public int getTotalHealth() {
		return totalHealth;
	}
	
	/**
	 * Returns the number of arrows the player has
	 * @return The number of arrows 
	 */
	public int getArrows(){
		return arrows;
	}
	
	/**
	 * Returns the number of rupees the player has
	 * @return The number of rupees 
	 */
	public int getRupees(){
		return rupees;
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
	 * Returns save ID of the current player
	 * @return Player save ID
	 */
	public int getSaveID(){
		return saveID;
	}
	
	@Override
	public Weapon getWeapon() {
		return weapon;
	}
	
	/**
	 * Gets the array of the elements and if the player has earned them
	 * @return Array elements in boolean form
	 */
	public boolean[] getElements(){
		return elements;
	}
	
	/**
	 * Returns true if the player is new, or did not have aprevious save
	 * @return 
	 */
	public boolean getIsNewSave(){
		return newSave;
	}
	
}
