package org.amm.dp.budai.creational.singleton;

public class SingletonEnumDemo {

	public static void main(String[] args) {
		DoHardWork();
	}

	public static void DoHardWork() {
		
		HardProcessor processor = new HardProcessor(1);
		LoggerSingletonEnum.INSTANCE.Log("Hard work started...");
		processor.ProcessTo(5);
		LoggerSingletonEnum.INSTANCE.Log("Hard work finished...");
	}
}
