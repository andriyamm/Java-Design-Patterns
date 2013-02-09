package org.amm.dp.budai.behavior.mediator;

public class Ear extends BodyPart {
	
	private String _sounds;

	public Ear(Brain brain) {
		super(brain);
	}

	public void HearSomething() {
		System.out.println("Enter what you hear:");
		_sounds = System.console().readLine();

		Changed();
	}

	public String GetSounds() {
		return _sounds;
	}
}
