package org.amm.dp.budai.behavior.interpreter;

//Context
public class CurrentPricesContext
{
Map<String, int> _prices = new HashMap<String, int>();

public CurrentPricesContext()
{
   _prices.Add("Bed", 3000);
   _prices.Add("TV", 400);
   _prices.Add("Laptop", 1500);
}

public int GetPrice(String goodName)
{
   if (_prices.ContainsKey(goodName))
   {
       return _prices[goodName];
   }
   else
   {
       throw new ArgumentException("Could not get price for the good that is not registered.");
   }
}

public void SetPrice(String goodName, int cost)
{
   if (_prices.ContainsKey(goodName))
   {
       _prices[goodName] = cost;
   }
   else
   {
       _prices.Add(goodName, cost);
   }
}
}


