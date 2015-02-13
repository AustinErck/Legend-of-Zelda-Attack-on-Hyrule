package loz.entities;

import loz.items.Weapon;

public class Player extends Entity{

	private String name;
	private int health;
	private int totalHealth;
	private int arrows;
	private int rupees;
	private Weapon weapon;
	private boolean[] elements = new boolean[3];
	
	public Player(String name, int health, int totalHealth, int arrows, int rupees, Weapon weapon, boolean forestElement, boolean waterElement, boolean fireElement){
		this.name = name;
		this.health = health;
		this.totalHealth = totalHealth;
		this.arrows = arrows;
		this.rupees = rupees;
		this.weapon = weapon;
		this.elements[0] = forestElement;
		this.elements[1] = waterElement;
		this.elements[2] = fireElement;
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

	@Override
	public Weapon getWeapon() {
		return weapon;
	}
	
	public int getRupees(){
		return rupees;
	}
	
	public int getArrows(){
		return arrows;
	}
	
	public String toHealthString(){
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
