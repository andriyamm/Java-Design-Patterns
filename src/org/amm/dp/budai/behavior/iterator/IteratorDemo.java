package org.amm.dp.budai.behavior.iterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		Hero andriybuday = new Hero("Andriy Buday");
		Army earthArmy = new Army(andriybuday);

		Group groupA = new Group();
		for (int i = 1; i < 4; ++i)
			groupA.AddNewSoldier(new Soldier("Alpha:" + i));

		Group groupB = new Group();
		for (int i = 1; i < 3; ++i)
			groupB.AddNewSoldier(new Soldier("Beta:" + i));

		Group groupC = new Group();
		for (int i = 1; i < 2; ++i)
			groupC.AddNewSoldier(new Soldier("Gamma:" + i));

		earthArmy.AddArmyGroup(groupB);
		earthArmy.AddArmyGroup(groupA);
		earthArmy.AddArmyGroup(groupC);

		SoldiersIterator iterator = new SoldiersIterator(earthArmy);
		while (iterator.hasNext()) {
			try {
				Soldier currSoldier;
				currSoldier = iterator.Next();
				currSoldier.Treat();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
