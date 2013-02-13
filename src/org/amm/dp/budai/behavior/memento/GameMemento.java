package org.amm.dp.budai.behavior.memento;



public class GameMemento
{
    private readonly GameState _state;

    public GameMemento(GameState state)
    {
        _state = state;
    }

    protected internal GameState GetState()
    {
        return _state;
    }
}
