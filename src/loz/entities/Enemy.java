package loz.entities;

import loz.items.Weapon;

public class Enemy extends Entity{

	private String name;
	private int health, totalHealth;
	private boolean isAlive;
	private Weapon weapon;
	
	public Enemy(EnumEnemy enumEnemy){
		this.name = enumEnemy.getName();
		this.health = enumEnemy.getHealth();
		this.totalHealth = enumEnemy.getHealth();
		this.weapon = enumEnemy.getWeapon();
		isAlive = true;
	}
	
	@Override
	public void update() {
		if(!isAlive){
			
		}	
	}

	@Override
	public void damage(int damage){
		if(damage < health){
			health -= damage;
		}else{
			isAlive = false;
		}
	}
	
	@Override
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

	@Override
	public Weapon getWeapon() {
		return weapon;
	}

	@Override
	public boolean isAlive() {
		return isAlive;
	}

}
