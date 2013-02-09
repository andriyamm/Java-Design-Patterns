package org.amm.dp.budai.structural.flyweight;

public abstract class Unit {
	public String Name;
	public int Health;
	public Image Picture;

	public String getName() {
		return Name;
	}

	protected void setName(String name) {
		Name = name;
	}

	public int getHealth() {
		return Health;
	}

	protected void setHealth(int health) {
		Health = health;
	}

	public Image getPicture() {
		return Picture;
	}

	protected void setPicture(Image picture) {
		Picture = picture;
	}

}
