package org.amm.dp.budai.behavior.command;

import java.util.List;
import java.util.ArrayList;

public class CommandDemo {
	public static void main(String[] args)
    {
		Customer customer = new Customer();
        // із певних міркуваня, босс завжди знає, що грошей стає тільки
        // oна бригаду Z
		Team team = new Team("Z");
        // також отримав список вимог, що треба буде передати бригаді
		List<Requirement> requirements = new ArrayList<Requirement>() { new Requirement("Cool web site"), new Requirement("Ability to book beer on site") };
        
		// yви повинні бути готові бути викликаним замовником
        ICommand commandX = new YouAsProjectManagerCommand(team, requirements);

        customer.AddCommand(commandX);

        // в компанії також є програміст-герой, що кодує на швидкості світла
        HeroDeveloper heroDeveloper = new HeroDeveloper();
        // босс вирішив віддати йому проект A
        ICommand commandA = new HeroDeveloperCommand(heroDeveloper, "A");

        customer.AddCommand(commandA);

        // як тільки замовник підписує контракт із вашим боссом
        // ваша бригада і програміст-герой готові виконати все що треба
        customer.SignContractWithBoss();
    }
}
