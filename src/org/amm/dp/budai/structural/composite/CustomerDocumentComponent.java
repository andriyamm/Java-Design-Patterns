package org.amm.dp.budai.structural.composite;

public class CustomerDocumentComponent implements IDocumentComponent {
	private int CustomerIdToGatherData;

	public CustomerDocumentComponent(int customerIdToGatherData) {
		CustomerIdToGatherData = customerIdToGatherData;
	}

	public String GatherData() {
		String customerData;
		switch (CustomerIdToGatherData) {
		case 41:
			customerData = "Andriy Buday";
			break;
		default:
			customerData = "Someone else";
			break;
		}
		return String.format("<Customer>{0}</Customer>", customerData);
	}

	public void AddComponent(IDocumentComponent documentComponent) {
		System.out.println("Cannot add to leaf...");
	}

	public int getCustomerIdToGatherData() {
		return CustomerIdToGatherData;
	}

	public void setCustomerIdToGatherData(int customerIdToGatherData) {
		CustomerIdToGatherData = customerIdToGatherData;
	}

}
