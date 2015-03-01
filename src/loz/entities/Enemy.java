package loz.entities;

public class Enemy extends Entity {

	public Enemy(EnumEnemy enumEnemy) {
		super(enumEnemy.getName(), enumEnemy.getDesc(), enumEnemy.getHealth(),
				enumEnemy.getHealth(), enumEnemy.getWeapon());
	}

}
