package org.amm.dp.budai.behavior.state;

public class Granted extends OrderState {
	
	public Granted(Order order) {
		super(order);
	}

	@Override
	public void AddProduct() {
		_order.DoAddProduct();
	}

	@Override
	public void Ship() {
		_order.DoShipping();
		_order.SetOrderState(new Shipped(_order));
	}

	@Override
	public void Cancel() {
		_order.DoCancel();
		_order.SetOrderState(new Cancelled(_order));
	}
}
