package org.amm.dp.budai.behavior.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class BestFriend extends WierdCafeVisitor {
	public List<Food> CoffeeContainingFood;

	public BestFriend(WierdCafeVisitor cafeVisitor) {
		super(cafeVisitor);
		CoffeeContainingFood = new ArrayList<Food>();
	}

	public void HandleFood(Food food) {
		if (food.getIngradients().contains("Meat")) {
			System.out.printf("BestFriend: I just ate %s. It was testy.",
					food.getName());
			return;
		}
		if (food.getIngradients().equals("Coffee")
				&& CoffeeContainingFood.size() < 1) {
			CoffeeContainingFood.add(food);
			System.out
					.printf("BestFriend: I have to take something with coffee. %s looks fine.",
							food.getName());
			return;
		}
		super.HandleFood(food);
	}
}