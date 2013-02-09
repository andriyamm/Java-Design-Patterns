package org.amm.dp.budai.structural.composite;


public class OrderDocumentComponent implements IDocumentComponent
{
    private int OrderIdToGatherData;

    public OrderDocumentComponent(int orderIdToGatherData)
    {
        OrderIdToGatherData = orderIdToGatherData;
    }

    public String GatherData()
    {
        String orderData;
        switch (OrderIdToGatherData)
        {
            case 0:
                orderData = "Kindle;Book1;Book2";
                break;
            default:
                orderData = "Phone;Cable;Headset";
                break;
        }

        return String.format("<Order>%d</Order>", orderData);
    }

    public void AddComponent(IDocumentComponent documentComponent)
    {
        System.out.println("Cannot add to leaf...");
    }

	public int getOrderIdToGatherData() {
		return OrderIdToGatherData;
	}

	public void setOrderIdToGatherData(int orderIdToGatherData) {
		OrderIdToGatherData = orderIdToGatherData;
	}
    
}
