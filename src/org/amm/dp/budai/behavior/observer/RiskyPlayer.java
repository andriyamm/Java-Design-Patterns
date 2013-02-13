package org.amm.dp.budai.behavior.observer;

public class RiskyPlayer implements IObserver
{
    public String BoxerToPutMoneyOn;

    public void Update(ISubject subject)
    {
    	ISubject boxFight = (BoxFight)subject;

        if (boxFight.BoxerAScore > boxFight.BoxerBScore)
            BoxerToPutMoneyOn = "I put on boxer B, if he win I get more!";
        else BoxerToPutMoneyOn = "I put on boxer A, if he win I get more!";

        System.out.println(BoxerToPutMoneyOn);
        System.out.println("RISKYPLAYER:{0}", BoxerToPutMoneyOn);
    }

	public String getBoxerToPutMoneyOn() {
		return BoxerToPutMoneyOn;
	}

	public void setBoxerToPutMoneyOn(String boxerToPutMoneyOn) {
		BoxerToPutMoneyOn = boxerToPutMoneyOn;
	}
    
}

