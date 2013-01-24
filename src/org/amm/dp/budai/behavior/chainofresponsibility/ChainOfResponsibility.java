package org.amm.dp.budai.behavior.chainofresponsibility;

import java.util.ArrayList;
import java.util.Arrays;

public class ChainOfResponsibility {
	public static void main(String[] args) {

		Food cappuccino1 = new Food("Cappuccino", new ArrayList<String>(
				Arrays.asList("Coffee", "Milk", "Sugar")));

		Food cappuccino2 = new Food("Cappuccino", new ArrayList<String>(
				Arrays.asList("Coffee", "Milk")));

		Food soup1 = new Food("Soup with meat", new ArrayList<String>(
				Arrays.asList("Meat", "Water", "Potato")));

		Food soup2 = new Food("Soup with potato", new ArrayList<String>(
				Arrays.asList("Water", "Potato")));

		Food meat = new Food("Meat", new ArrayList<String>(
				Arrays.asList("Meat")));

		GirlFriend girlFriend = new GirlFriend(null);
		Me me = new Me(girlFriend);
		BestFriend bestFriend = new BestFriend(me);

		bestFriend.HandleFood(cappuccino1);
		bestFriend.HandleFood(cappuccino2);
		bestFriend.HandleFood(soup1);
		bestFriend.HandleFood(soup2);
		bestFriend.HandleFood(meat);
	}
}