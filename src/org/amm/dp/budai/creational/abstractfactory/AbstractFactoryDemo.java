package org.amm.dp.budai.creational.abstractfactory;

import org.amm.dp.budai.creational.abstractfactory.animal.Bear;
import org.amm.dp.budai.creational.abstractfactory.animal.Cat;

public class AbstractFactoryDemo {

	public static void main(String... args) {
		RunWoodenFactory();
		RunTeddyFactory();
	}

	private static void RunWoodenFactory() {
		// lets start with wooden factory
		// �������� �������� �����'��� �������
		IToyFactory toyFactory = new WoodenToysFactory();

		Bear bear = toyFactory.getBear();
		Cat cat = toyFactory.getCat();
		System.out.printf("I've got %s and %s \n", bear.getName(), cat.getName());
		// Output/����: [I've got Wooden Bear and Wooden Cat]
	}

	private static void RunTeddyFactory() {
		// and now teddy one
		// � ����� �������
		IToyFactory toyFactory = new TeddyToysFactory();

		Bear bear = toyFactory.getBear();
		Cat cat = toyFactory.getCat();
		System.out.printf("I've got %s and %s \n", bear.getName(), cat.getName());
		// Output/����: [I've got Teddy Bear and Teddy Cat]
	}

}
