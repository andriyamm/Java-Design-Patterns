package org.amm.dp.budai.creational.builder;

public class TripLaptopBuilder extends LaptopBuilder {
	@Override
	public void SetMonitorResolution() {
		laptop.setMonitorResolution("1200X800");
	}

	@Override
	public void SetProcessor() {
		laptop.setProcessor("Celeron 2 GHz");
	}

	@Override
	public void SetMemory() {
		laptop.setMemory("2048 Mb");
	}

	@Override
	public void SetHDD() {
		laptop.setHDD("250 Gb");
	}

	@Override
	public void SetBattery() {
		laptop.setBattery("12 lbs");
	}
}
