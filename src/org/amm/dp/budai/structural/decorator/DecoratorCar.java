package org.amm.dp.budai.structural.decorator;

public class DecoratorCar extends Car {
	
	protected Car decoratedCar;

	public DecoratorCar(Car decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	@Override
	public void Go() {
		decoratedCar.Go();
	}

	public Car getDecoratedCar() {
		return decoratedCar;
	}

	public void setDecoratedCar(Car decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

}
