package org.amm.dp.budai.behavior.command;

public class Requirement {
	
	public String UserStory;

	public Requirement(String userStory) {
		UserStory = userStory;
	}

	public String getUserStory() {
		return UserStory;
	}

	public void setUserStory(String userStory) {
		UserStory = userStory;
	}

}
