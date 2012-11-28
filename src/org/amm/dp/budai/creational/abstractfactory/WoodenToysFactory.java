package org.amm.dp.budai.creational.abstractfactory;

import org.amm.dp.budai.creational.abstractfactory.animal.Bear;
import org.amm.dp.budai.creational.abstractfactory.animal.Cat;
import org.amm.dp.budai.creational.abstractfactory.animal.wooden.WoodenBear;
import org.amm.dp.budai.creational.abstractfactory.animal.wooden.WoodenCat;

public class WoodenToysFactory implements IToyFactory{

	@Override
	public Bear getBear() {
		return new WoodenBear("Wooden Bear");
	}

	@Override
	public Cat getCat() {
		return new WoodenCat("Wooden Cat");
	}

}
