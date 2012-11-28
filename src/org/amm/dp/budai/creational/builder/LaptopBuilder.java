package org.amm.dp.budai.creational.builder;

abstract class LaptopBuilder {
	
	protected Laptop laptop;

	public void CreateNewLaptop() {
		laptop = new Laptop();
	}

	// Метод, який повертає готовий ноутбук назовні
	public Laptop GetMyLaptop() {
		return laptop;
	}

	// Кроки, необхідні щоб створити ноутбук
	public abstract void SetMonitorResolution();

	public abstract void SetProcessor();

	public abstract void SetMemory();

	public abstract void SetHDD();

	public abstract void SetBattery();
}
