package org.amm.dp.budai.structural.bridge;

public class BuldingCompany implements IBuldingCompany {
	
	private IWallCreator wallCreator;
	
	public void BuildFoundation() {
		System.out.println("Foundation is built. \n");
	}

	public void BuildRoom() {
		wallCreator.BuildWallWithDoor();
		wallCreator.BuildWall();
		wallCreator.BuildWallWithWindow();
		wallCreator.BuildWall();
		System.out.println("Room finished. \n");
	}

	public void BuildRoof() {
		System.out.println("Roof is done. \n");
	}

	public IWallCreator getWallCreator() {
		return wallCreator;
	}

	public void setWallCreator(IWallCreator wallCreator) {
		this.wallCreator = wallCreator;
	}

}
