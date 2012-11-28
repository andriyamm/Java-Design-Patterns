package org.amm.dp.budai.creational.builder;

public class BuilderDemo {
	
	public static void Run() {
		
		// Your system could have bulk of builders
		LaptopBuilder tripBuilder = new TripLaptopBuilder();
		LaptopBuilder gamingBuilder = new GamingLaptopBuilder();
		BuyLaptop shopForYou = new BuyLaptop();// director

		shopForYou.SetLaptopBuilder(gamingBuilder);// Customer answered that he
													// wants to play
		shopForYou.ConstructLaptop();
		Laptop laptop = shopForYou.GetLaptop();// just get what he wants
		laptop.toPrint();
	}
}
