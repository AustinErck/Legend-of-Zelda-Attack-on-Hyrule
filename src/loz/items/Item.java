package loz.items;

import loz.mechanics.GameObject;

public class Item extends GameObject {

	private String name, desc;
	
	/**
	 * Creates an Item object
	 * @param name Name of item
	 * @param desc Description of item
	 */
	public Item(String name, String desc){
		this.name = name;
		this.desc = desc;
	}
	
	/**
	 * Gets the name of the item
	 * @return Name of item
	 */
	@Override
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the description of the item
	 * @return Description of item
	 */
	public String getDesc() {
		return desc;
	}

}
