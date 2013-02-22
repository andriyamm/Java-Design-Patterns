package org.amm.dp.budai.behavior.interpreter;


public class InterpreterDemo
{
    public static void main(String[] args)
    {
        new InterpreterDemo().RunInterpreterDemo();
    }

    public void RunInterpreterDemo()
    {
        // create syntax tree that represents sentence
    	GoodsPackage truckWithGoods = PrepareTruckWithGoods();
        // get latest context
    	CurrentPricesContext pricesContext = GetRecentPricesContext();
        // invoke Interpret
        int totalPriceForGoods = truckWithGoods.Interpret(pricesContext);

        System.out.printf("Total: {0}", totalPriceForGoods);
    }

    private CurrentPricesContext GetRecentPricesContext()
    {
    	CurrentPricesContext pricesContext = new CurrentPricesContext();
        pricesContext.SetPrice("Bed", 400);
        pricesContext.SetPrice("TV", 100);
        pricesContext.SetPrice("Laptop", 500);
        return pricesContext;
    }

    public GoodsPackage PrepareTruckWithGoods()
    {
        var truck = new GoodsPackage() { GoodsInside = new List<Goods>() };

        var bed = new Bed();
        var doubleTriplePackedBed = new GoodsPackage()
            {
                GoodsInside = new List<Goods>() { new GoodsPackage() { GoodsInside = new List<Goods>() { bed } } }
            };
        truck.GoodsInside.Add(doubleTriplePackedBed);
        truck.GoodsInside.Add(new TV());
        truck.GoodsInside.Add(new TV());
        truck.GoodsInside.Add(new GoodsPackage()
            {
                GoodsInside = new List<Goods>() { new Laptop(), new Laptop(), new Laptop() }
            });

        return truck;
    }
}
