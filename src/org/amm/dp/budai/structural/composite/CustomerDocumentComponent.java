package org.amm.dp.budai.structural.composite;

public class CustomerDocumentComponent implements IDocumentComponent {
	
	private int customerIdToGatherData;

	public CustomerDocumentComponent(int customerIdToGatherData) {
		this.customerIdToGatherData = customerIdToGatherData;
	}

	public String GatherData() {
		String customerData;
		switch (customerIdToGatherData) {
		case 41:
			customerData = "Andriy Buday";
			break;
		default:
			customerData = "Someone else";
			break;
		}
		return String.format("<Customer>%s</Customer>", customerData);
	}

	public void AddComponent(IDocumentComponent documentComponent) {
		System.out.println("Cannot add to leaf...");
	}

	public int getCustomerIdToGatherData() {
		return customerIdToGatherData;
	}

	public void setCustomerIdToGatherData(int customerIdToGatherData) {
		this.customerIdToGatherData = customerIdToGatherData;
	}

}
