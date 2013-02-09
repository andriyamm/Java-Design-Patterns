package org.amm.dp.budai.structural.flyweight;

import java.util.List;

public class FlyweightDemo {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Unit> units = new Parser().ParseHTML();
	}
	
}
