package org.amm.dp.budai.behavior.command;

public class HeroDeveloperCommand implements ICommand {
	
	public HeroDeveloperCommand(HeroDeveloper heroDeveloper, String projectName) {
		HeroDeveloper = heroDeveloper;
		ProjectName = projectName;
	}

	public void Execute() {
		// реалізація делегує роботу до потрібного отримувача
		HeroDeveloper.DoAllHardWork(ProjectName);
	}

	protected HeroDeveloper HeroDeveloper;
	protected String ProjectName;

	public HeroDeveloper getHeroDeveloper() {
		return HeroDeveloper;
	}

	public void setHeroDeveloper(HeroDeveloper heroDeveloper) {
		HeroDeveloper = heroDeveloper;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

}
