package org.amm.dp.budai.structural.bridge;

public class ConcreteSlabWallCreator implements IWallCreator {

	public void BuildWallWithDoor() {
		System.out.println("Concrete slab wall with door.");
	}

	public void BuildWallWithWindow() {
		System.out.println("Concrete slab wall with window.");
	}

	public void BuildWall() {
		System.out.println("Concrete slab wall.");
	}
}