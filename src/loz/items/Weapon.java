package loz.items;

import loz.entities.Entity;

public class Weapon extends Item {

	private String weaponID;
	private int damage;
	private double critChance;

	/**
	 * Creates a Weapon object that entities can use to attack other entities
	 * 
	 * @param name
	 *            Name of weapon
	 * @param desc
	 *            Description of weapon
	 * @param damage
	 *            Damage weapon does
	 * @param critChance
	 *            Chance of a critical hit
	 */
	public Weapon(EnumWeapon enumWeapon) {
		super(enumWeapon.getName(), enumWeapon.getDesc());
		this.weaponID = enumWeapon.getWeponID();
		this.damage = enumWeapon.getDamage();
		this.critChance = enumWeapon.getCritChance();
	}

	public String getWeaponID() {
		return weaponID;
	}

	public double slash(Entity entity){
		return damage;
	}
	
	public double hammer(){
		int tmp = (int) (Math.random() * 100);
		if(tmp <= 79){
			if(tmp <= (critChance * 100)){
				return (double) damage * 1.5;
			}else{
				return damage;
			}
		}else{
			return 0;
		}
	}
	
	public double jab(){
		int tmp = (int) (Math.random() * 100);
		if(tmp <= 60){
			return (double) damage * 2;
		}else{
			return damage;
		}
	}
}
