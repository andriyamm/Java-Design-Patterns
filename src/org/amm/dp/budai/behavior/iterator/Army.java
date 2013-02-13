package org.amm.dp.budai.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class Army {
	
	public Hero ArmyHero;
	public List<Group> ArmyGroups;

	public Army(Hero armyHero) {
		ArmyHero = armyHero;
		ArmyGroups = new ArrayList<Group>();
	}

	public void AddArmyGroup(Group group) {
		ArmyGroups.add(group);
	}

	public List<Group> getArmyGroups() {
		return ArmyGroups;
	}

	public void setArmyGroups(List<Group> armyGroups) {
		ArmyGroups = armyGroups;
	}

}
