package org.amm.dp.budai.structural.bridge;

public class BrickWallCreator implements IWallCreator {
	
	public void BuildWallWithDoor() {
		System.out.println("Brick wall with door.");
	}

	public void BuildWallWithWindow() {
		System.out.println("Brick wall with window.");
	}

	public void BuildWall() {
		System.out.println("Brick wall.");
	}
}
