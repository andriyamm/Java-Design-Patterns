package org.amm.dp.budai.behavior.observer;

//
public class ConservativePlayer implements IObserver {
	
	public String BoxerToPutMoneyOn;

	public void Update(ISubject subject) {
		ISubject boxFight = (BoxFight) subject;

		if (boxFight.getBoxerAScore() < boxFight.getBoxerBScore())
			BoxerToPutMoneyOn = "I put on boxer B, better be safe!";
		else
			BoxerToPutMoneyOn = "I put on boxer A, better be safe!";

		System.out.printf("CONSERVATIVEPLAYER:%s", BoxerToPutMoneyOn);
	}

	public String getBoxerToPutMoneyOn() {
		return BoxerToPutMoneyOn;
	}

	public void setBoxerToPutMoneyOn(String boxerToPutMoneyOn) {
		BoxerToPutMoneyOn = boxerToPutMoneyOn;
	}

}
