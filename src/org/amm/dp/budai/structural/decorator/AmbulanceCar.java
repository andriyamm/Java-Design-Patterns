package org.amm.dp.budai.structural.decorator;

public class AmbulanceCar extends DecoratorCar {
	
	public AmbulanceCar(Car decoratedCar) {
		super(decoratedCar);
	}

	@Override
	public void Go() {
		super.Go();
		System.out.println("... beep-beep-beeeeeep ...");
	}
}
