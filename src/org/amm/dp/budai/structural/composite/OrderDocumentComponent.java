package org.amm.dp.budai.structural.composite;

public class OrderDocumentComponent implements IDocumentComponent {
	
	private int orderIdToGatherData;

	public OrderDocumentComponent(int orderIdToGatherData) {
		this.orderIdToGatherData = orderIdToGatherData;
	}

	public String GatherData() {
		String orderData;
		switch (orderIdToGatherData) {
		case 0:
			orderData = "Kindle;Book1;Book2";
			break;
		default:
			orderData = "Phone;Cable;Headset";
			break;
		}

		return String.format("<Order>%s</Order>", orderData);
	}

	public void AddComponent(IDocumentComponent documentComponent) {
		System.out.println("Cannot add to leaf...");
	}

	public int getOrderIdToGatherData() {
		return orderIdToGatherData;
	}

	public void setOrderIdToGatherData(int orderIdToGatherData) {
		this.orderIdToGatherData = orderIdToGatherData;
	}

}
