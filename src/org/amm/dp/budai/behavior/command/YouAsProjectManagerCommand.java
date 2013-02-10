package org.amm.dp.budai.behavior.command;

import java.util.List;

public class YouAsProjectManagerCommand implements ICommand {
	
	public YouAsProjectManagerCommand(Team team, List<Requirement> requirements) {
		Team = team;
		Requirements = requirements;
	}

	public void Execute() {
		// реалізація делегує роботу до потрібного отримувача
		Team.CompleteProject(Requirements);
	}

	protected Team Team;
	protected List<Requirement> Requirements;

	public Team getTeam() {
		return Team;
	}

	public void setTeam(Team team) {
		Team = team;
	}

	public List<Requirement> getRequirements() {
		return Requirements;
	}

	public void setRequirements(List<Requirement> requirements) {
		Requirements = requirements;
	}

}
