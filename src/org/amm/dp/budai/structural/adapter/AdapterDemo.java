package org.amm.dp.budai.structural.adapter;

public class AdapterDemo {
	public static void main(String[] args) {
		// 1)
		// �� ������ � ����� ����������� ����� ����� ��������
		INewElectricitySystem newElectricitySystem = new NewElectricitySystem();
		ElectricityConsumer.ChargeNotebook(newElectricitySystem);

		// 2)
		// �� ������ ������������ �� ����� �������, �������������� �������
		OldElectricitySystem oldElectricitySystem = new OldElectricitySystem();
		Adapter adapter = new Adapter(oldElectricitySystem);
		ElectricityConsumer.ChargeNotebook(adapter);
	}
}