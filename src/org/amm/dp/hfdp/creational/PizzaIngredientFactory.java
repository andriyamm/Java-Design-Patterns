package org.amm.patterns.abstractfactory.hfdp;

import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Cheese;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Clams;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Dough;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Pepperoni;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Sauce;
import org.amm.patterns.abstractfactory.hfdp.comp.interfaces.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
