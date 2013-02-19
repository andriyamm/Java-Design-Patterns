package org.amm.dp.budai.structural.flyweight;

public abstract class Unit {
	
	public String name;
	public int health;
	public Image picture;

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	protected void setHealth(int health) {
		this.health = health;
	}

	public Image getPicture() {
		return picture;
	}

	protected void setPicture(Image picture) {
		this.picture = picture;
	}
}
