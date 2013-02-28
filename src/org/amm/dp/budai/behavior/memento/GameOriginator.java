package org.amm.dp.budai.behavior.memento;

public class GameOriginator {
	
	private GameState state = new GameState(100, 0);// Health & Killed Monsters

	public void Play() {
		// During this Play method game's state is continuously changed
		System.out.println(state.toString());
		state = new GameState((int) (state.health * 0.9),
				state.killedMonsters + 2);
	}

	public GameMemento GameSave() {
		return new GameMemento(state);
	}

	public void LoadGame(GameMemento memento) {
		state = memento.GetState();
	}
}
