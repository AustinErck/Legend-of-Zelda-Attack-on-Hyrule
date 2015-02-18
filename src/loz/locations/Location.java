package loz.locations;

import loz.mechanics.GameObject;

public class Location extends GameObject{

	private String name;
	private boolean isWall;
	
	public Location(String name, boolean isWall){
		this.name = name;
		this.isWall = isWall;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public Boolean isWall(){
		return isWall;
	}

}
