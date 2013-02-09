package org.amm.dp.budai.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class UnitImagesFactory {
	
	public static Map<String, Image> Images = new HashMap<String, Image>();

	public static Image CreateDragonImage() {
		if (!Images.containsKey("Dragon")) {
			Images.put("Dragon", Image.Load("Dragon.jpg"));
		}
		return Images[typeof(Dragon)];
	}

	public static Image CreateGoblinImage() {
		if (!Images.containsKey("Goblin")) {
			Images.put("Goblin", Image.Load("Goblin.jpg"));
		}
		return Images[typeof(Goblin)];
	}
}
