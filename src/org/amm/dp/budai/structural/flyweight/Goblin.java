package org.amm.dp.budai.structural.flyweight;

public class Goblin extends Unit {
	
	public Goblin() {
		name = "Goblin";
		health = 8;
		// old
		picture = Image.Load("Goblin.jpg");
		// new
		picture = UnitImagesFactory.CreateGoblinImage();
	}
}
