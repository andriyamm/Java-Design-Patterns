package org.amm.dp.budai.creational.abstractfactory.animal;

public abstract class AnimalToy {
	
	protected String name;

	protected AnimalToy(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
