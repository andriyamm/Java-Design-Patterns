package org.amm.dp.budai.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class Group {
	
	public List<Soldier> soldiers;

	public Group() {
		soldiers = new ArrayList<Soldier>();
	}

	public void AddNewSoldier(Soldier soldier) {
		soldiers.add(soldier);
	}

	public List<Soldier> getSoldiers() {
		return soldiers;
	}

	public void setSoldiers(List<Soldier> soldiers) {
		this.soldiers = soldiers;
	}

}
