package org.amm.dp.budai.behavior.memento;

public class GameMemento {
	
	private final GameState state;

	public GameMemento(GameState state) {
		this.state = state;
	}

	protected GameState GetState() {
		return state;
	}
}
