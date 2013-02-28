package org.amm.dp.budai.behavior.observer;

public class ObserverDemo {
	
	public static void main(String[] args) {
		ISubject boxFight = new BoxFight();

		IObserver riskyPlayer = new RiskyPlayer();
		IObserver conservativePlayer = new ConservativePlayer();

		boxFight.AttachObserver(riskyPlayer);
		boxFight.AttachObserver(conservativePlayer);

		boxFight.NextRound();
		boxFight.NextRound();
		boxFight.NextRound();
		boxFight.NextRound();
	}
}
