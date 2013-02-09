package org.amm.dp.budai.behavior.state;

public class StateDemo {
	
	public static void main(String[] args) {
		Product beer = new Product();
		beer.name = "MyBestBeer";
		beer.price = 78000;

		Order order = new Order();
		order.WriteCurrentStateName();

		order.AddProduct(beer);
		order.WriteCurrentStateName();

		order.Register();
		order.WriteCurrentStateName();

		order.Grant();
		order.WriteCurrentStateName();

		order.Ship();
		order.WriteCurrentStateName();

		// trying to add more beer to already shipped order
		order.AddProduct(beer);
		order.WriteCurrentStateName();

		// order.Invoice();
		// order.WriteCurrentStateName();
	}
}