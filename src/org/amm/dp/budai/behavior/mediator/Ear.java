package org.amm.dp.budai.behavior.mediator;

import java.util.Scanner;

public class Ear extends BodyPart {
	
	private String sounds;

	public Ear(Brain brain) {
		super(brain);
	}

	public void HearSomething() {
		System.out.println("Enter what you hear:");
		sounds = new Scanner(System.in).next();

		Changed();
	}

	public String GetSounds() {
		return sounds;
	}
}
