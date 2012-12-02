package org.amm.dp.budai.behavior.strategy;

public class Myself {
	
	private IWearingStrategy _wearingStrategy = new DefaultWearingStrategy();

	public void ChangeStrategy(IWearingStrategy wearingStrategy) {
		_wearingStrategy = wearingStrategy;
	}

	public void GoOutside() {
		String clothes = _wearingStrategy.GetClothes();
		String accessories = _wearingStrategy.GetAccessories();
		System.out.printf("Today I wore %s and took %s", clothes, accessories);
	}
}