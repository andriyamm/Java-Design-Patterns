package org.amm.dp.budai.behavior.iterator;

import org.amm.dp.budai.behavior.iterator.Hero.Army;




public class SoldiersIterator
{
    private readonly Army _army;
    private bool _heroIsIterated;
    private int _currentGroup;
    private int _currentGroupSoldier;

    public SoldiersIterator(Army army)
    {
        _army = army;
        _heroIsIterated = false;
        _currentGroup = 0;
        _currentGroupSoldier = 0;
    }

    public bool HasNext()
    {
        if (!_heroIsIterated) return true;
        if (_currentGroup < _army.ArmyGroups.Count) return true;
        if (_currentGroup == _army.ArmyGroups.Count - 1)
            if (_currentGroupSoldier < _army.ArmyGroups[_currentGroup].Soldiers.Count) return true;

        return false;
    }

    public Soldier Next()
    {
        Soldier nextSoldier;
        // we still not iterated all soldiers in current group
        if (_currentGroup < _army.ArmyGroups.Count)
        {
            if (_currentGroupSoldier < _army.ArmyGroups[_currentGroup].Soldiers.Count)
            {
                nextSoldier = _army.ArmyGroups[_currentGroup].Soldiers[_currentGroupSoldier];
                _currentGroupSoldier++;
            }
            // moving to next group
            else
            {
                _currentGroup++;
                _currentGroupSoldier = 0;
                return Next();
            }
        }
        // hero is the last who left the battlefield
        else if (!_heroIsIterated)
        {
            _heroIsIterated = true;
            return _army.ArmyHero;
        }
        else
        {
            // THROW EXCEPTION HERE
            throw new Exception("End of colletion");
            //or set all counters to 0 and start again, but not recommended
        }
        return nextSoldier;
    }
}
