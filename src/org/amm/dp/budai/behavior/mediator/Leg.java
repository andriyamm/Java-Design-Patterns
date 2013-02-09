package org.amm.dp.budai.behavior.mediator;

public class Leg extends BodyPart {
	
	public Leg(Brain brain) {
		super(brain);
	}

	public void Kick() {
		System.out.println("LEG: Just kicked offender in front of you..");
	}

	public void StepBack() {
		System.out.println("LEG: Stepping back...");
	}

	public void StepForward() {
		System.out.println("LEG: Stepping forward...");
	}
}
