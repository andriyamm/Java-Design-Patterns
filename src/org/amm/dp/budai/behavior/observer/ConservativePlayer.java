package org.amm.dp.budai.behavior.observer;

//
public class ConservativePlayer implements IObserver
{
    public String BoxerToPutMoneyOn;

    public void Update(ISubject subject)
    {
    	ISubject boxFight = (BoxFight)subject;

        if (boxFight.BoxerAScore < boxFight.BoxerBScore)
            BoxerToPutMoneyOn = "I put on boxer B, better be safe!";
        else BoxerToPutMoneyOn = "I put on boxer A, better be safe!";

        System.out.println("CONSERVATIVEPLAYER:{0}", BoxerToPutMoneyOn);
    }

	public String getBoxerToPutMoneyOn() {
		return BoxerToPutMoneyOn;
	}

	public void setBoxerToPutMoneyOn(String boxerToPutMoneyOn) {
		BoxerToPutMoneyOn = boxerToPutMoneyOn;
	}
    
    
}
