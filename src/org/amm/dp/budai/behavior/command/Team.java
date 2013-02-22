package org.amm.dp.budai.behavior.command;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Team {
	
	public String Name;

	public Team(String name) {
		Name = name;
	}

	public void CompleteProject(List<Requirement> requirements) {
		AnalyzeRequirements(requirements);
		for (Requirement requirement : requirements) {
			WorkOnRequirement(requirement);
		}
	}

	private void WorkOnRequirement(Requirement requirement) {
		System.out.printf("User Story ({0}) has been completed",
				requirement.UserStory);
	}

	private void AnalyzeRequirements(List<Requirement> requirements) {
		for (Requirement requirement : requirements) {
			if (StringUtils.isEmpty(requirement.UserStory)) {
				throw new IllegalArgumentException(
						"not enought information on some of the requirements...");
			}
		}
	}
}
