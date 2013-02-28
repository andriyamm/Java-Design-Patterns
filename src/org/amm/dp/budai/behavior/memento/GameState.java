package org.amm.dp.budai.behavior.memento;

public class GameState {

	public double health;
	public int killedMonsters;
	
	public GameState(double health, int killedMonsters) {
		this.health = health;
		this.killedMonsters = killedMonsters;
	}


	@Override
	public String toString() {
		return String.format(
				"Health: %f" + System.getProperty("line.separator")
						+ "Killed Monsters: %d", health, killedMonsters);
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public int getKilledMonsters() {
		return killedMonsters;
	}

	public void setKilledMonsters(int killedMonsters) {
		this.killedMonsters = killedMonsters;
	}

}
