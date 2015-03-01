package loz.items;

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

	/**
	 * Gets the base damage the weapon deals
	 * 
	 * @return The base damage the weapon deals
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * Gets the chance of a critical hit when attacking
	 * 
	 * @return Chance of a critical hit when attacking
	 */
	public double getCritChance() {
		return critChance;
	}
}
