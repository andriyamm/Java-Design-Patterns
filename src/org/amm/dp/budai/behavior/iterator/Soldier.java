package org.amm.dp.budai.behavior.iterator;

public class Soldier {
	
	public String name;
	public int health;
	private final int SoldierHealthPoints = 100;

	protected int maxHealthPoints;

	protected int getMaxHealthPoints() {
		return SoldierHealthPoints;
	}

	public Soldier(String name) {
		this.name = name;
	}

	public void Treat() {
		health = maxHealthPoints;
		System.out.println(name);
	}
}
