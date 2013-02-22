package org.amm.dp.budai.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

//Context
public class CurrentPricesContext {
	
	Map<String, Integer> prices = new HashMap<String, Integer>();

	public CurrentPricesContext() {
		prices.put("Bed", 3000);
		prices.put("TV", 400);
		prices.put("Laptop", 1500);
	}

	public int GetPrice(String goodName) {
		if (prices.containsKey(goodName)) {
			return prices.get(goodName);
		} else {
			throw new IllegalArgumentException(
					"Could not get price for the good that is not registered.");
		}
	}

	public void SetPrice(String goodName, int cost) {
		if (prices.containsKey(goodName)) {
			prices.put(goodName, cost);
		} else {
			prices.put(goodName, cost);
		}
	}
}
