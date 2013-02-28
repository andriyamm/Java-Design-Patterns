package org.amm.dp.budai.behavior.mediator;

import java.util.Scanner;

public class Eye extends BodyPart {
	
	private String thingsAround;

	public Eye(Brain brain) {
		super(brain);
	}

	public void SeeSomething() {
		System.out.println("Enter what you see:");
		thingsAround = new Scanner(System.in).next();

		Changed();
	}

	public String get_thingsAround() {
		return thingsAround;
	}

	public void set_thingsAround(String _thingsAround) {
		this.thingsAround = _thingsAround;
	}
}