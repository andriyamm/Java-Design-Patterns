package org.amm.dp.budai.behavior.strategy;

public class StrategyDemo {
	
	public static void main(String[] args) {
		Myself me = new Myself();
		me.ChangeStrategy(new RainWearingStrategy());
		me.GoOutside();
	}
}