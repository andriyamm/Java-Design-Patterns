package org.amm.dp.budai.structural.adapter;

public class AdapterDemo {
	public static void main(String[] args) {
		// 1)
		// Ми можемо і надалі користувати нашою новою системою
		INewElectricitySystem newElectricitySystem = new NewElectricitySystem();
		ElectricityConsumer.ChargeNotebook(newElectricitySystem);

		// 2)
		// Ми повинні адаптуватися до старої системи, використовуючи адаптер
		OldElectricitySystem oldElectricitySystem = new OldElectricitySystem();
		Adapter adapter = new Adapter(oldElectricitySystem);
		ElectricityConsumer.ChargeNotebook(adapter);
	}
}