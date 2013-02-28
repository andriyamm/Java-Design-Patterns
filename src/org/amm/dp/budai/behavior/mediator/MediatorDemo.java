package org.amm.dp.budai.behavior.mediator;

import java.util.Scanner;

public class MediatorDemo {

	public static void main(String[] args) {
		Brain human = new Brain();

		String line = new String();
		AskForInput();
		Scanner scanIn = new Scanner(System.in);
		while (scanIn.hasNext()) {
			line = scanIn.next();
			if (line.equals("Ear")) {
				human.getEar().HearSomething();
			} else if (line.equals("Eye")) {
				human.getEye().SeeSomething();
			} else {
				human.getHand().FeelSomething();
			}
			AskForInput();
		}
	}

	private static void AskForInput() {
		System.out
				.println("Enter body part ('Ear','Eye','Hand' or empty to exit):");
	}
}
