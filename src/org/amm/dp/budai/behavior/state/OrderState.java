package org.amm.dp.budai.behavior.state;

public class OrderState {
	
	public Order _order;

	public OrderState(Order order) {
		_order = order;
	}

	public void AddProduct() {
		OperationIsNotAllowed("AddProduct");
	}

	public void Register() {
		OperationIsNotAllowed("AddProduct");
	}

	public void Grant() {
		OperationIsNotAllowed("Grant");
	}

	public void Ship() {
		OperationIsNotAllowed("Ship");
	}

	public void Invoice() {
		OperationIsNotAllowed("Invoice");
	}

	public void Cancel() {
		OperationIsNotAllowed("Cancel");
	}

	private void OperationIsNotAllowed(String operationName) {
		System.out.println(
				"Operation {0} is not allowed for Order's state {1}",
				operationName, this.GetType().name);
	}
}