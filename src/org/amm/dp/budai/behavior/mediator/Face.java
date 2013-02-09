package org.amm.dp.budai.behavior.mediator;

public class Face extends BodyPart {
	
	public Face(Brain brain) {
		super(brain);
	}

	public void Smile() {
		System.out.println("FACE: Smiling...");
	}
}
