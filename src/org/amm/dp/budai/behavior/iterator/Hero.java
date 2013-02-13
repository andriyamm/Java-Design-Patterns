package org.amm.dp.budai.behavior.iterator;

public class Hero extends Soldier
{
    private final int HeroHealthPoints = 500;
    protected override int MaxHealthPoints;

    public Hero(String name)
    {
    	super(name);
    }

	public int getHeroHealthPoints() {
		return HeroHealthPoints;
	}
    
    
}
