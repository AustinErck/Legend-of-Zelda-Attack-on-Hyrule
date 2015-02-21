package loz.locations;

public enum EnumLocations{
	
	PATH_FIELD("Field", "a wide open field", 0.4, 0.3, 0.3, 0.3),
	PATH_FOREST("Forest Clearing", "a clearing in the forest ahead", 0.4, 0.3, 0.3, 0.3),
	PATH_MOUNTAIN("Mountain", "a path covered in small rocks", 0.4, 0.3, 0.3, 0.3),
	PATH_LAKE("Lake", "a beautiful, sparkling lake", 0.4, 0.3, 0.3, 0.3),
	PATH_CASTLE("Castle", "a nicely paved path", 0.4, 0.3, 0.3, 0.3),
	WALL_FIELD("Brick Wall", "a sturdy brick wall"),
	WALL_FOREST("Forest Wall", "a dark, dense patch of trees. To close together to get through."),
	WALL_MOUNTAIN("Mountain Wall", "a nicely paved path"),
	WALL_LAKE("Castle", "a nicely paved path"),
	WALL_CASTLE("Castle", "a nicely paved path");
	
	private boolean isAWall;
	private String name, desc;
	private double enemySpawnRate,enemyDifficulty, itemSpawnRate, itemRarity;
	
	private EnumLocations(String name, String desc, double enemySpawnRate, double enemyDifficulty, double itemSpawnRate, double itemRarity){
		isAWall = false;
		this.name = name;
		this.desc = desc;
		this.enemySpawnRate = enemySpawnRate;
		this.enemyDifficulty = enemyDifficulty;
		this.itemSpawnRate = itemSpawnRate;
		this.itemRarity = itemRarity;
	}
	
	private EnumLocations(String name, String desc){
		isAWall = true;
	}
	
	public boolean isAWall(){
		return isAWall;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public double getEnemySpawnRate(){
		return enemySpawnRate;
	}
	
	public double getEnemyDifficulty(){
		return enemyDifficulty;
	}
	
	public double getItemSpawnRate(){
		return itemSpawnRate;
	}
	
	public double getItemRarity(){
		return itemRarity;
	}
	
}