package org.amm.dp.budai.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class UnitImagesFactory {
	
	public static Map<Class<?>, Image> Images = new HashMap<Class<?>, Image>();

	public static Image CreateDragonImage() {
		if (!Images.containsKey(Dragon.class)) {
			Images.put(Dragon.class, Image.Load("Dragon.jpg"));
		}
		return Images.get(Dragon.class);
	}

	public static Image CreateGoblinImage() {
		if (!Images.containsKey("Goblin")) {
			Images.put(Goblin.class, Image.Load("Goblin.jpg"));
		}
		return Images.get(Goblin.class);
	}
}
