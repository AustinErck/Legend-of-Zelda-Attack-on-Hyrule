package loz.locations;

import loz.mechanics.GameObject;

public class Location extends GameObject{

	private String name;
	boolean isAWall;
	
	public Location(String name, boolean isAWall){
		this.name = name;
		this.isAWall = isAWall;
	}
	
	public boolean isAWall(){
		return isAWall;
	}

	@Override
	public String getName() {
		return name;
	}
}
