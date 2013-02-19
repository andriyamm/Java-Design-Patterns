package org.amm.dp.budai.structural.fasade;

public class FacadeDemo {

	public static void main(String[] args) {
		SkiResortFacade skiResortFacade = new SkiResortFacade();
		int weekendRestPrice = skiResortFacade.HaveGoodRest(175, 60, 42, 2, 3);
		System.out.printf("Price: {%d}", weekendRestPrice);
	}
}