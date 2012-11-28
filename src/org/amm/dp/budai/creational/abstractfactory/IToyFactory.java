package org.amm.dp.budai.creational.abstractfactory;

import org.amm.dp.budai.creational.abstractfactory.animal.Bear;
import org.amm.dp.budai.creational.abstractfactory.animal.Cat;

public interface IToyFactory {
	Bear getBear();
	Cat getCat();
}
