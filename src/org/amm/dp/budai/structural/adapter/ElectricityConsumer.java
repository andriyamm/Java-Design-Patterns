package org.amm.dp.budai.structural.adapter;

public class ElectricityConsumer {
	// �������� ������� ����쳺 ����� ���� �������
	public static void ChargeNotebook(INewElectricitySystem electricitySystem) {
		System.out.println(electricitySystem.MatchWideSocket());
	}
}