package org.amm.patterns.abstractfactory.hfdp;

import org.amm.patterns.abstractfactory.hfdp.comp.impl.FreshClams;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.Garlic;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.MarinaraSauce;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.Mushroom;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.Onion;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.RedPepper;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.ReggianoCheese;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.SlicedPepperoni;
import org.amm.patterns.abstractfactory.hfdp.comp.impl.ThinCrustDough;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Cheese;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Clams;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Dough;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Pepperoni;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Sauce;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Veggies;

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
