package org.amm.dp.budai.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class Army {
	
	public Hero armyHero;
	public List<Group> armyGroups;

	public Army(Hero armyHero) {
		this.armyHero = armyHero;
		armyGroups = new ArrayList<Group>();
	}

	public void AddArmyGroup(Group group) {
		armyGroups.add(group);
	}

	public List<Group> getArmyGroups() {
		return armyGroups;
	}

	public void setArmyGroups(List<Group> armyGroups) {
		this.armyGroups = armyGroups;
	}

}
