package org.amm.dp.budai.structural.composite;



public class CompositeDemo
{
    public static void Run()
    {
        IDocumentComponent document = new DocumentComponent("ComposableDocument");
        IDocumentComponent headerDocumentSection = new HeaderDocumentComponent();
        IDocumentComponent body = new DocumentComponent("Body");
        document.AddComponent(headerDocumentSection);
        document.AddComponent(body);

        IDocumentComponent customerDocumentSection = new CustomerDocumentComponent(41);
        IDocumentComponent orders = new DocumentComponent("Orders");
        IDocumentComponent order0 = new OrderDocumentComponent(0);
        IDocumentComponent order1 = new OrderDocumentComponent(1);
        orders.AddComponent(order0);
        orders.AddComponent(order1);

        body.AddComponent(customerDocumentSection);
        body.AddComponent(orders);

        String gatheredData = document.GatherData();

        System.out.println(gatheredData);
    }
}
