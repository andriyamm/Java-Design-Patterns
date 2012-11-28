package org.amm.dp.budai.creational.builder;

public class Laptop {
	private String MonitorResolution;
	private String Processor;
	private String Memory;
	private String HDD;
	private String Battery;

	public String getMonitorResolution() {
		return MonitorResolution;
	}

	public void setMonitorResolution(String monitorResolution) {
		MonitorResolution = monitorResolution;
	}

	public String getProcessor() {
		return Processor;
	}

	public void setProcessor(String processor) {
		Processor = processor;
	}

	public String getMemory() {
		return Memory;
	}

	public void setMemory(String memory) {
		Memory = memory;
	}

	public String getHDD() {
		return HDD;
	}

	public void setHDD(String hDD) {
		HDD = hDD;
	}

	public String getBattery() {
		return Battery;
	}

	public void setBattery(String battery) {
		Battery = battery;
	}

	public void toPrint() {
		System.out.printf("Laptop: %s, %s, %s, %s, %s", MonitorResolution,
				Processor, Memory, HDD, Battery);
	}

}
