package org.amm.dp.budai.structural.decorator;

public class Car {
	
	protected String brandName;

	public void Go() {
		System.out.println("I'm " + brandName + " and I'm on my way...");
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
