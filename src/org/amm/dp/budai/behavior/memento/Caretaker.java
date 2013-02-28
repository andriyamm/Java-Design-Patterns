package org.amm.dp.budai.behavior.memento;

import java.util.Stack;

public class Caretaker {
	
	private final GameOriginator game = new GameOriginator();
	private final Stack<GameMemento> quickSaves = new Stack<GameMemento>();

	public void ShootThatDumbAss() {
		game.Play();
	}

	public void F5() {
		quickSaves.push(game.GameSave());
	}

	public void F9() {
		game.LoadGame(quickSaves.peek());
	}
}
