package org.amm.dp.hfdp.creational.abstractfactory;

import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.BlackOlives;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.Eggplant;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.FrozenClams;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.MozzarellaCheese;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.PlumTomatoSauce;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.SlicedPepperoni;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.Spinach;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.ThickCrustDough;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Cheese;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Clams;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Dough;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Pepperoni;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Sauce;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
