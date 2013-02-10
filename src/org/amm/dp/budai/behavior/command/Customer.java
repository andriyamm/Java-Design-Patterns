package org.amm.dp.budai.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	protected List<ICommand> Commands;

	public Customer() {
		Commands = new ArrayList<ICommand>();
	}

	public void AddCommand(ICommand command) {
		Commands.add(command);
	}

	public void SignContractWithBoss() {
		for (ICommand command : Commands) {
			command.Execute();
		}
	}
}
