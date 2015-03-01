package loz.entities;

import loz.items.EnumWeapon;
import loz.items.Weapon;

public enum EnumEnemy {

	STALFOS("Stalfos", "a skeleton like creature with a sword", 12, new Weapon(
			EnumWeapon.FIGHTERS_SWORD)), BOKOBLIN("Bokoblin",
			"a pig like creature who carries a sword", 10, new Weapon(
					EnumWeapon.MINIONS_SWORD)), BULBLIN("Blubin",
			"a goblin like creature wielding a club", 10, new Weapon(
					EnumWeapon.CLUB_SWORD)), OCTOROK("Octorok",
			"a small four legged creature who shoots you with rocks", 6,
			new Weapon(EnumWeapon.OCTOROK_CANNON)), CHUCHU("ChuChu",
			"a slimy little monster who attacks you by jumping", 6, new Weapon(
					EnumWeapon.CHUCHU_JUMP)), KEESE("Keese",
			"a bat who while quick is very weak", 4, new Weapon(
					EnumWeapon.KEESE_DIVEBOMB));

	private String name, desc;
	private int health;
	private Weapon weapon;

	private EnumEnemy(String name, String desc, int health, Weapon weapon) {
		this.name = name;
		this.desc = desc;
		this.health = health;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public int getHealth() {
		return health;
	}

	public Weapon getWeapon() {
		return weapon;
	}
}
