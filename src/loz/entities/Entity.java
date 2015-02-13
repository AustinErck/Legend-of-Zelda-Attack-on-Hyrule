package loz.entities;

import loz.items.Weapon;
import loz.mechanics.GameObject;

public abstract class Entity extends GameObject {

	@Override
	public abstract String getName();
	
	public abstract int getHealth();
	
	public abstract int getTotalHealth();
	
	public abstract Weapon getWeapon();

}
