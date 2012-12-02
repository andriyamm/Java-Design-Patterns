package org.amm.dp.hfdp.creational.abstractfactory;

import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Cheese;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Clams;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Dough;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Pepperoni;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Sauce;
import org.amm.dp.hfdp.creational.abstractfactory.comp.interfaces.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
