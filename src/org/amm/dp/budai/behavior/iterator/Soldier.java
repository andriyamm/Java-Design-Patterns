package org.amm.dp.budai.behavior.iterator;

public class Soldier
{
    public String Name;
    public int Health;
    private final int SoldierHealthPoints = 100;
    protected virtual int MaxHealthPoints { get { return SoldierHealthPoints; } }

    public Soldier(String name)
    {
        Name = name;
    }
    public void Treat()
    {
        Health = MaxHealthPoints;
        System.out.println(Name);
    }
}

