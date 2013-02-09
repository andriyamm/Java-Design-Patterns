package org.amm.dp.budai.structural.adapter;

public class ElectricityConsumer {
	// Зарядний пристрій розуміє тільки нову систему
	public static void ChargeNotebook(INewElectricitySystem electricitySystem) {
		System.out.println(electricitySystem.MatchWideSocket());
	}
}