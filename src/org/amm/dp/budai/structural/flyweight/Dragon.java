package org.amm.dp.budai.structural.flyweight;

public class Dragon extends Unit {
	
	public Dragon() {
		name = "Dragon";
		health = 50;
		// old
		picture = Image.Load("Dragon.jpg");
		// new
		picture = UnitImagesFactory.CreateDragonImage();
	}
}
