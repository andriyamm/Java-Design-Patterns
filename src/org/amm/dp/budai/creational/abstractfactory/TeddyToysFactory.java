package org.amm.dp.budai.creational.abstractfactory;

import org.amm.dp.budai.creational.abstractfactory.animal.Bear;
import org.amm.dp.budai.creational.abstractfactory.animal.Cat;
import org.amm.dp.budai.creational.abstractfactory.animal.teddy.TeddyBear;
import org.amm.dp.budai.creational.abstractfactory.animal.teddy.TeddyCat;

public class TeddyToysFactory implements IToyFactory{

	@Override
	public Bear getBear() {
		return new TeddyBear("Teddy Bear");
	}

	@Override
	public Cat getCat() {
		return new TeddyCat("Teddy Cat");
	}

}
