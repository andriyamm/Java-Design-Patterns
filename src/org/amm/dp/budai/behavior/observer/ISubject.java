package org.amm.dp.budai.behavior.observer;

interface ISubject {

	void AttachObserver(IObserver observer);

	void DetachObserver(IObserver observer);

	void Notify();

	int getBoxerAScore();

	int getBoxerBScore();

	void NextRound();
}
