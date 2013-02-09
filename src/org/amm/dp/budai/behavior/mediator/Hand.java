package org.amm.dp.budai.behavior.mediator;

public class Hand extends BodyPart {
	
	private boolean _isSoft;
	private boolean _isHurting;

	public Hand(Brain brain) {
		super(brain);
	}

	public void FeelSomething() {
		System.out.println("What you feel is soft? (Yes/No)");
		String answer = System.console().readLine();
		if (answer != null && answer[0] == 'Y') {
			_isSoft = true;
		}
		System.out.println("What you feel is hurting? (Yes/No)");
		answer = System.console().readLine();
		if (answer != null && answer[0] == 'Y') {
			_isHurting = true;
		}

		Changed();
	}

	public void HitPersonNearYou() {
		System.out.println("HAND: Just hit offender...");
	}

	public void Embrace() {
		System.out.println("HAND: Embracing what is in front of you...");
	}

	public boolean DoesItHurt() {
		return _isHurting;
	}

	public boolean IsItNice() {
		return !_isHurting && _isSoft;
	}
}
