package org.amm.dp.budai.behavior.mediator;

public class BodyPart {
	
	private final Brain brain;

	public BodyPart(Brain brain) {
		this.brain = brain;
	}

	public void Changed() {
		brain.SomethingHappenedToBodyPart(this);
	}
}
