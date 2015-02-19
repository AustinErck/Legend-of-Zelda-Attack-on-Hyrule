package loz.items;

public class Weapon extends Item{
	
	private String name, desc;
	private int damage;
	private double critChance;
	
	/**
	 * Creates a Weapon object that entities can use to attack other entities
	 * @param name Name of weapon
	 * @param desc Description of weapon
	 * @param damage Damage weapon does
	 * @param critChance Chance of a critical hit
	 */
	public Weapon(String name, String desc, int damage, double critChance){
		super(name, desc);
		this.name = name;
		this.desc = desc;
		this.damage = damage;
		this.critChance = critChance;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDesc(){
		return desc;
	}
	
	/**
	 * Gets the base damage the weapon deals
	 * @return The base damage the weapon deals
	 */
	public int getDamage(){
		return damage;
	}
	
	/**
	 * Gets the chance of a critical hit when attacking
	 * @return Chance of a critical hit when attacking
	 */
	public double getCritChance(){
		return critChance;
	}
}
