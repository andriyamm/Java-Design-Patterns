package org.amm.dp.budai.behavior.state;

public class NewOrder extends OrderState {
	
	public NewOrder(Order order) {
		super(order);
	}

	@Override
	public void AddProduct() {
		_order.DoAddProduct();
	}

	@Override
	public void Register() {
		_order.DoRegister();
		_order.SetOrderState(new Registered(_order));
	}

	@Override
	public void Cancel() {
		_order.DoCancel();
		_order.SetOrderState(new Cancelled(_order));
	}
}