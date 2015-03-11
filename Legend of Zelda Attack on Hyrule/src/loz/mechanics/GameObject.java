package loz.mechanics;

public class GameObject {

	private String name, desc;

	public GameObject(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	/**
	 * Gets the objects name
	 * 
	 * @return The object's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the objects description
	 * 
	 * @return The object's description
	 */
	public String getDesc() {
		return desc;
	}

}
