package loz.locations;

import loz.mechanics.GameObject;

public class Location extends GameObject{

	private EnumLocations locationInfo;
	
	public Location(EnumLocations locationInfo){
		this.locationInfo = locationInfo;
	}
	
	public boolean isAWall(){
		return locationInfo.isAWall();
	}

	@Override
	public String getName() {
		return locationInfo.getName();
	}
}
