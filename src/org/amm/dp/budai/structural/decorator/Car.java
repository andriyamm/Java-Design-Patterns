package org.amm.dp.budai.structural.decorator;

public class Car {
	
	protected String BrandName;

	public void Go() {
		System.out.println("I'm " + BrandName + " and I'm on my way...");
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

}
