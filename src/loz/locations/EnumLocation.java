package loz.locations;

public enum EnumLocation {

	PATH_FIELD("field", "a wide open field", 0.4, 0.3, 0.3, 0.3), PATH_FOREST(
			"forest clearing", "a clearing in the forest ahead", 0.4, 0.3, 0.3,
			0.3), PATH_MOUNTAIN("mountain", "a path covered in small rocks",
			0.4, 0.3, 0.3, 0.3), PATH_LAKE("lake",
			"a nice path that seems dry enough to walk on.", 0.4, 0.3, 0.3, 0.3), PATH_CASTLE(
			"castle", "a nicely paved path", 0.4, 0.3, 0.3, 0.3), WALL_FIELD(
			"brick wall", "a sturdy brick wall"), WALL_FOREST("forest wall",
			"a dark, dense patch of trees. To close together to get through."), WALL_MOUNTAIN(
			"mountain wall", "a nicely paved path"), WALL_LAKE("lake",
			"a beautiful, sparkling lake"), WALL_CASTLE("castle wall",
			"a nicely paved path"), SPECIAL_FOREST("",
			"the forest element"), SPECIAL_MOUNTAIN("",
					"the fire element"), SPECIAL_LAKE("",
							"the water element"), SPECIAL_CASTLE("castle wall",
									"the master sword");

	private boolean isAWall;
	private String name, desc;
	private double enemySpawnRate, enemyDifficulty, itemSpawnRate, itemRarity;

	private EnumLocation(String name, String desc, double enemySpawnRate,
			double enemyDifficulty, double itemSpawnRate, double itemRarity) {
		isAWall = false;
		this.name = name;
		this.desc = desc;
		this.enemySpawnRate = enemySpawnRate;
		this.enemyDifficulty = enemyDifficulty;
		this.itemSpawnRate = itemSpawnRate;
		this.itemRarity = itemRarity;
	}

	private EnumLocation(String name, String desc) {
		isAWall = true;
		this.name = name;
		this.desc = desc;
	}

	public boolean isAWall() {
		return isAWall;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public double getEnemySpawnRate() {
		return enemySpawnRate;
	}

	public double getEnemyDifficulty() {
		return enemyDifficulty;
	}

	public double getItemSpawnRate() {
		return itemSpawnRate;
	}

	public double getItemRarity() {
		return itemRarity;
	}

}