package loz.entities;

import loz.items.Weapon;
import loz.mechanics.GameObject;

public abstract class Entity extends GameObject {

	/**
	 * Called when turn if over to update entity
	 */
	public abstract void update();
	
	/**
	 * Damages the entity
	 * @param damage The amount of damage the entity takes
	 */
	public abstract void damage(int damage);
	
	/**
	 * Heals the entity
	 * @param heal The amount of health the entity gets
	 */
	public abstract void heal(int heal);
	
	/**
	 * Gets the name of the entity
	 */
	@Override
	public abstract String getName();
	
	/**
	 * Gets the current health of the entity
	 * @return Total health of entity
	 */
	public abstract int getHealth();
	
	/**
	 * Gets the total health of the entity
	 * @return Total health of entity
	 */
	public abstract int getTotalHealth();
	
	/**
	 * Gets the weapon the entity has
	 * @return Weapon entity has
	 */
	public abstract Weapon getWeapon();
	
	/**
	 * Outputs the players total health as a string of "<"s and "3"s
	 * @return A string of hearts representing the players total health
	 */
	public String totalHealthToString(Player player){
		String output = "";
		for(int j = 0; j < player.getTotalHealth(); j++){
			if( j % 2 == 0){
				output += "<";
			}else{
				output += "3 ";
			}
		}
		return output;
	}
	
}
