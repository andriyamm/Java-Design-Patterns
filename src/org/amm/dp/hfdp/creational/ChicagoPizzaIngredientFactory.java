package org.amm.patterns.abstractfactory.hfdp;

import org.amm.patterns.abstractfactory.hfdp.comp.impl.BlackOlives;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.Eggplant;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.FrozenClams;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.MozzarellaCheese;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.PlumTomatoSauce;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.SlicedPepperoni;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.Spinach;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.ThickCrustDough;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Cheese;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Clams;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Dough;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Pepperoni;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Sauce;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Veggies;

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
