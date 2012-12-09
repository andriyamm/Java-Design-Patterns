package org.amm.dp.budai.behavior.chainofresponsibility;

public class GirlFriend extends WierdCafeVisitor {
	
	public GirlFriend(WierdCafeVisitor cafeVisitor) {
		super(cafeVisitor);
	}

	public void HandleFood(Food food) {
		if (food.Name == "Cappuccino") {
			System.out.println("GirlFriend: My lovely cappuccino!!!");
			return;
		}
		super.HandleFood(food);
	}
}