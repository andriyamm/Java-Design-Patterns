package org.amm.dp.budai.creational.builder;

class GamingLaptopBuilder extends LaptopBuilder {

	@Override
	public void SetMonitorResolution() {
		laptop.setMonitorResolution("1900X1200");
	}

	@Override
	public void SetProcessor() {
		laptop.setProcessor("Core 2 Duo, 3.2 GHz");
	}

	@Override
	public void SetMemory() {
		laptop.setMemory("6144 Mb");
	}

	@Override
	public void SetHDD() {
		laptop.setHDD("500 Gb");
	}

	@Override
	public void SetBattery() {
		laptop.setBattery("6 lbs");
	}
}
