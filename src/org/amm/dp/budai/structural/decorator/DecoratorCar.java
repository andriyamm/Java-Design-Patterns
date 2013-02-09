package org.amm.dp.budai.structural.decorator;

public class DecoratorCar extends Car {
	
	protected Car DecoratedCar;

	public DecoratorCar(Car decoratedCar) {
		DecoratedCar = decoratedCar;
	}

	@Override
	public void Go() {
		DecoratedCar.Go();
	}

	public Car getDecoratedCar() {
		return DecoratedCar;
	}

	public void setDecoratedCar(Car decoratedCar) {
		DecoratedCar = decoratedCar;
	}

}
