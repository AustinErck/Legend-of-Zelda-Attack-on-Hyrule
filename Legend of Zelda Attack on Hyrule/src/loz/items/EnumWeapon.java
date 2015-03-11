package loz.items;

public enum EnumWeapon {
	WOODEN_SWORD("WOODEN_SWORD", "Wooden Sword", "a very basic sword", 4, 0.15), KEESE_DIVEBOMB(
			"KEESE_DIVEBOMB", "Dive Bomb",
			"the keese dive bombs you from the air", 2, 0.15), OCTOROK_CANNON(
			"OCTOROK_CANNON", "Octorok Cannon", "octorok shoots a rock at you",
			3, 0.1), CHUCHU_JUMP("CHUCHU_JUMP", "ChuChu jump",
			"ChuChu jumps on top of you", 3, 0.16), CLUB_SWORD("CLUB_SWORD",
			"Club", "a club made of hard rock", 4, 0.1), MINIONS_SWORD(
			"MINIONS_SWORD", "Minions Sword",
			"a sword wielded by mionions of Ganondorf", 6, 0.05), FIGHTERS_SWORD(
			"FIGHTERS_SWORD", "Fighters Sword",
			"a sword of a once great warrior", 7, 0.07), MASTER_SWORD("MASTER_SWORD", "Master Sword", "a sword that can bend time it's self", 8, 0.2);

	private String name, desc, weaponID;
	private int damage;
	private double critChance;

	private EnumWeapon(String weaponID, String name, String desc, int damage,
			double critChance) {
		this.weaponID = weaponID;
		this.name = name;
		this.desc = desc;
		this.damage = damage;
		this.critChance = critChance;
	}

	public String getWeponID() {
		return weaponID;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public int getDamage() {
		return damage;
	}

	public double getCritChance() {
		return critChance;
	}
}
