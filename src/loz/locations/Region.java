package loz.locations;

import loz.mechanics.GameObject;

public class Region extends GameObject{

	private Location[][] regionMap;
	
	public Region(String name, String desc,Location[][] regionMap) {
		super(name, desc);
		if(regionMap.length == 10 && regionMap[0].length == 10){
			this.regionMap = regionMap;
		}else{
			System.out.println("Map Region Invalid...Quitting");
		}
	}
	
	public Location getLocationInfo(int xPos, int yPos){
		return regionMap[yPos][xPos];
	}
	
	public Location[][] getRegionMap(){
		return regionMap;
	}

}
