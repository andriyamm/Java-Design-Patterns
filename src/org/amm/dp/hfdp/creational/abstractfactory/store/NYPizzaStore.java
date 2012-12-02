package org.amm.dp.hfdp.creational.abstractfactory.store;

import org.amm.dp.hfdp.creational.abstractfactory.NYPizzaIngredientFactory;
import org.amm.dp.hfdp.creational.abstractfactory.PizzaIngredientFactory;
import org.amm.dp.hfdp.creational.abstractfactory.pizza.CheesePizza;
import org.amm.dp.hfdp.creational.abstractfactory.pizza.ClamPizza;
import org.amm.dp.hfdp.creational.abstractfactory.pizza.PepperoniPizza;
import org.amm.dp.hfdp.creational.abstractfactory.pizza.Pizza;
import org.amm.dp.hfdp.creational.abstractfactory.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
