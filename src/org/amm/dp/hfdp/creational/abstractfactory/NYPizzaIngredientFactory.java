package org.amm.dp.hfdp.creational.abstractfactory;

import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.FreshClams;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.Garlic;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.MarinaraSauce;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.Mushroom;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.Onion;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.RedPepper;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.ReggianoCheese;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.SlicedPepperoni;
import org.amm.dp.hfdp.creational.abstractfactory.comp.impl.ThinCrustDough;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Cheese;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Clams;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Dough;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Pepperoni;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Sauce;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
