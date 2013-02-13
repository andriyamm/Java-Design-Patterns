package org.amm.dp.budai.behavior.observer;

public class ObserverDemo {
	
	public static void main(String[] args) {
		ISubject boxFight = new BoxFight();

		ISubject riskyPlayer = new RiskyPlayer();
		ISubject conservativePlayer = new ConservativePlayer();

		boxFight.AttachObserver(riskyPlayer);
		boxFight.AttachObserver(conservativePlayer);

		boxFight.NextRound();
		boxFight.NextRound();
		boxFight.NextRound();
		boxFight.NextRound();
	}
}
