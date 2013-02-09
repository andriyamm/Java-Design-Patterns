package org.amm.dp.budai.behavior.mediator;

public class Eye extends BodyPart {
	
	private String _thingsAround;

	public Eye(Brain brain) {
		super(brain);
	}

	public void SeeSomething() {
		System.out.println("Enter what you see:");
		this.set_thingsAround(System.console().readLine());

		Changed();
	}

	public String get_thingsAround() {
		return _thingsAround;
	}

	public void set_thingsAround(String _thingsAround) {
		this._thingsAround = _thingsAround;
	}
}