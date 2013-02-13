package org.amm.dp.budai.behavior.memento;

public class GameOriginator
{
    private GameState _state = new GameState(100, 0);//Health & Killed Monsters

    public void Play()
    {
        //During this Play method game's state is continuously changed
        System.out.println(_state.ToString());
        _state = new GameState((int)(_state.Health * 0.9), _state.KilledMonsters + 2);
    }

    public GameMemento GameSave()
    {
        return new GameMemento(_state);
    }

    public void LoadGame(GameMemento memento)
    {
        _state = memento.GetState();
    }
}
