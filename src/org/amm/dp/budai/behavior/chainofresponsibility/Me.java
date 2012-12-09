package org.amm.dp.budai.behavior.chainofresponsibility;

public class Me extends WierdCafeVisitor
{
    public Me(WierdCafeVisitor cafeVisitor)
    {
    	super(cafeVisitor);
    }

    public void HandleFood(Food food)
    {
        if (food.getName().equalsIgnoreCase("Soup"))
        {
            System.out.println("Me: I like Soup. It went well.");
        }
        super.HandleFood(food);
    }
}
