package org.amm.dp.budai.behavior.iterator;




public class SoldiersIterator
{
    private final Army army;
    private boolean heroIsIterated;
    private int currentGroup;
    private int currentGroupSoldier;

    public SoldiersIterator(Army army)
    {
        this.army = army;
        heroIsIterated = false;
        currentGroup = 0;
        currentGroupSoldier = 0;
    }

    public boolean hasNext()
    {
        if (!heroIsIterated) return true;
        if (currentGroup < army.armyGroups.size()) return true;
        if (currentGroup == army.armyGroups.size() - 1)
            if (currentGroupSoldier < army.armyGroups.get(currentGroup).soldiers.size()) return true;

        return false;
    }

    public Soldier Next() throws Exception
    {
        Soldier nextSoldier;
        // we still not iterated all soldiers in current group
        if (currentGroup < army.armyGroups.size())
        {
            if (currentGroupSoldier < army.armyGroups.get(currentGroup).soldiers.size())
            {
                nextSoldier = army.armyGroups.get(currentGroup).soldiers.get(currentGroupSoldier);
                currentGroupSoldier++;
            }
            // moving to next group
            else
            {
                currentGroup++;
                currentGroupSoldier = 0;
                return Next();
            }
        }
        // hero is the last who left the battlefield
        else if (!heroIsIterated)
        {
            heroIsIterated = true;
            return army.armyHero;
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
