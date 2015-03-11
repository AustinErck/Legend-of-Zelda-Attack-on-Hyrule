package loz.entities;

import loz.items.Weapon;
import loz.mechanics.GameObject;

public class Entity extends GameObject {

	private int totalHealth, currentHealth;
	public Weapon weapon;
	private boolean isAlive;

	public Entity(String name, String desc, int totalHealth, int currentHealth,
			Weapon weapon) {
		super(name, desc);
		this.totalHealth = totalHealth;
		this.currentHealth = currentHealth;
		this.weapon = weapon;
		this.isAlive = true;
	}

	/**
	 * Damages the entity
	 * 
	 * @param damage
	 *            The amount of damage the entity takes
	 */
	public void damage(int damage) {
		if (damage < currentHealth) {
			currentHealth -= damage;
		} else {
			isAlive = false;
		}
	}

	/**
	 * Heals the entity
	 * 
	 * @param heal
	 *            The amount of health the entity gets
	 */
	public void heal(int heal) {
		if ((heal + currentHealth) > totalHealth) {
			currentHealth = totalHealth;
		} else {
			currentHealth += heal;
		}
	}

	/**
	 * Gets the current health of the entity
	 * 
	 * @return Total health of entity
	 */
	public int getHealth() {
		return currentHealth;
	}

	/**
	 * Gets the total health of the entity
	 * 
	 * @return Total health of entity
	 */
	public int getTotalHealth() {
		return totalHealth;
	}

	/**
	 * Gets the weapon the entity has
	 * 
	 * @return Weapon entity has
	 */
	public Weapon getWeapon() {
		return weapon;
	}

	/**
	 * Tests to see if the entity is alive
	 * 
	 * @return True if entity is alive
	 */
	public boolean isAlive() {
		return isAlive;
	}

	/**
	 * Outputs the players total health as a string of "<"s and "3"s
	 * 
	 * @return A string of hearts representing the players total health
	 */
	public String totalHealthToString(Player player) {
		String output = "";
		for (int j = 0; j < player.getTotalHealth(); j++) {
			if (j % 2 == 0) {
				output += "<";
			} else {
				output += "3 ";
			}
		}
		return output;
	}

}
