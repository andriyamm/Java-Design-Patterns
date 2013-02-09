package org.amm.dp.budai.behavior.state;

public class Registered extends OrderState {
	
	public Registered(Order order) {
		super(order);
	}

	@Override
	public void AddProduct() {
		_order.DoAddProduct();
	}

	@Override
	public void Grant() {
		_order.DoGrant();
		_order.SetOrderState(new Granted(_order));
	}

	@Override
	public void Cancel() {
		_order.DoCancel();
		_order.SetOrderState(new Cancelled(_order));
	}
}
