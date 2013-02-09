package org.amm.dp.budai.structural.decorator;

public class DecoratorDemo {
	
	public static void main(String[] args) {
		Car doctorsDream = new AmbulanceCar(new Mersedes());
		doctorsDream.Go();
	}
}
