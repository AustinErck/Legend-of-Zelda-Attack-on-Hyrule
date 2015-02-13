package loz.items;

import loz.mechanics.GameObject;

public class Weapon extends GameObject{
	
	private String name;
	private int damage;
	private double critChance;
	
	public Weapon(String name, int damage, double critChance){
		this.name = name;
		this.damage = damage;
		this.critChance = critChance;
	}

	@Override
	public String getName() {
		return name;
	}
	
	public int getDamage(){
		return damage;
	}
	
	public double getCritChance(){
		return critChance;
	}
}
