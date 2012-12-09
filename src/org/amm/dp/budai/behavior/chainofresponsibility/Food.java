package org.amm.dp.budai.behavior.chainofresponsibility;

import java.util.List;

public class Food
{
    public Food(String name, List<String> ingradients)
    {
        Name = name;
        Ingradients = ingradients;
    }

    public List<String> Ingradients;
    public List<String> getIngradients() {
		return Ingradients;
	}
	public void setIngradients(List<String> ingradients) {
		Ingradients = ingradients;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public String Name;
}
