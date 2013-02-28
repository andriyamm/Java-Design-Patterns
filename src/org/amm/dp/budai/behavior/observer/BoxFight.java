package org.amm.dp.budai.behavior.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//

public class BoxFight implements ISubject {
	private List<IObserver> Observers;
	private int RoundNumber;
	private Random random = new Random();

	public int BoxerAScore;
	public int BoxerBScore;

	public BoxFight() {
		Observers = new ArrayList<IObserver>();
	}

	public void AttachObserver(IObserver observer) {
		Observers.add(observer);
	}

	public void DetachObserver(IObserver observer) {
		Observers.remove(observer);
	}

	public void NextRound() {
		RoundNumber++;

		BoxerAScore += random.nextInt(5);
		BoxerBScore += random.nextInt(5);

		Notify();
	}

	public void Notify()
    {
        for(IObserver observer : Observers)
        {
            observer.Update(this);
        }
    }

	public List<IObserver> getObservers() {
		return Observers;
	}

	public void setObservers(List<IObserver> observers) {
		Observers = observers;
	}

	public int getRoundNumber() {
		return RoundNumber;
	}

	public void setRoundNumber(int roundNumber) {
		RoundNumber = roundNumber;
	}

	public int getBoxerAScore() {
		return BoxerAScore;
	}

	public void setBoxerAScore(int boxerAScore) {
		BoxerAScore = boxerAScore;
	}

	public int getBoxerBScore() {
		return BoxerBScore;
	}

	public void setBoxerBScore(int boxerBScore) {
		BoxerBScore = boxerBScore;
	}

}
