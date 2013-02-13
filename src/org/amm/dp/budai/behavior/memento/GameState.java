package org.amm.dp.budai.behavior.memento;



public class GameState
{
    public GameState(double health, int killedMonsters)
    {
        Health = health;
        KilledMonsters = killedMonsters;
    }

    public double Health;
    public int KilledMonsters;

    @Override
    public String ToString()
    {
        return string.Format("Health: {0}{1}Killed Monsters: {2}", Health, Environment.NewLine, KilledMonsters);
    }

	public double getHealth() {
		return Health;
	}

	public void setHealth(double health) {
		Health = health;
	}

	public int getKilledMonsters() {
		return KilledMonsters;
	}

	public void setKilledMonsters(int killedMonsters) {
		KilledMonsters = killedMonsters;
	}
    
    
}
