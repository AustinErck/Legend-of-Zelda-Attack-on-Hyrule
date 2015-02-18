package loz.locations;

import loz.mechanics.GameObject;

public class Region extends GameObject{

	private String name;
	private int id;
	
	public Region(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public int getId(){
		return id;
	}

}
