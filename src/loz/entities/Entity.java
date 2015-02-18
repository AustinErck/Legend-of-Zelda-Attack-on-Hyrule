package loz.entities;

import loz.items.Weapon;
import loz.mechanics.GameObject;

public abstract class Entity extends GameObject {

	public abstract void update();
	
	@Override
	public abstract String getName();
	
	public abstract int getHealth();
	
	public abstract int getTotalHealth();
	
	public abstract Weapon getWeapon();
	
	public abstract void damage(int damage);
	
	public abstract void heal(int heal);
	
}
