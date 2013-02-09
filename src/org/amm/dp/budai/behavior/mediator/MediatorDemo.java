package org.amm.dp.budai.behavior.mediator;

import org.apache.commons.lang3.StringUtils;

public class MediatorDemo
{
    public static void Run()
    {
    	Brain human = new Brain();

        String line;
        AskForInput();
        while (!StringUtils.isEmpty(line = System.console().readLine()))
        {
            switch (line)
            {
                case "Ear":
                    human.Ear.HearSomething();
                    break;
                case "Eye":
                    human.Eye.SeeSomething();
                    break;
                case "Hand":
                    human.Hand.FeelSomething();
                    break;
            }
            AskForInput();
        }
    }

    private static void AskForInput()
    {
        Console.ForegroundColor = ConsoleColor.DarkGray;
        Console.WriteLine("Enter body part ('Ear','Eye','Hand' or empty to exit):");
        Console.ForegroundColor = ConsoleColor.Green;
    }
}
