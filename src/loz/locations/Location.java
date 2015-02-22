package loz.locations;

import loz.mechanics.GameObject;
import loz.mechanics.GameUtil;

public class Location extends GameObject{

	private EnumLocations locationInfo;
	private int[] items;
	
	/**
	 * Creates a new location in the game
	 * @param locationInfo Type of location the location is
	 */
	public Location(EnumLocations locationInfo){
		this.locationInfo = locationInfo;
		//items = {(int) (Math.random() * locationInfo.getItemRarity() * 10), (int) (Math.random() * locationInfo.getItemRarity() * 10), (int) (Math.random() * 1)};
	}
	
	/**
	 * Generates items in the current location on request
	 * @param location 
	 */
	public void generateItems(EnumLocations location){
		GameUtil.println("You look on the ground around you and you find:");
		if(items[0] != 0){
			if(items[0] == 1){
				GameUtil.println("  A single rupee");
			}else{
				GameUtil.println("  " + items[0] + " rupees");
			}
		}
		if(items[1] != 0){
			if(items[0] == 1){
				GameUtil.println("  an arrow");
			}else{
				GameUtil.println("  " + items[1] + " arrows");
			}
		}
		if(items[2] != 0){
			if(items[0] == 1){
				GameUtil.println("  a heart");
			}else{
				GameUtil.println("  " + items[2] + " hearts");
			}
		}
		if(items[0] != 0 && items[1] != 0 && items[2] != 0){
			GameUtil.println("  Northing!");
		}
	}
	
	/**
	 * Tests to see if the location is a wall
	 * @return boolean representing if the location is a wall
	 */
	public boolean isAWall(){
		return locationInfo.isAWall();
	}

	/**
	 * Gets the name of the current location
	 */
	@Override
	public String getName() {
		return locationInfo.getName();
	}
	
	/**
	 * Gets the current type of location, used for more advanced location actions such as items and enemies
	 * @return
	 */
	public EnumLocations getEnumLocations(){
		return locationInfo;
	}
}
