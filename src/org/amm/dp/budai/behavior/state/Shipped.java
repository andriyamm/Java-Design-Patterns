package org.amm.dp.budai.behavior.state;

public class Shipped extends OrderState {
	
	public Shipped(Order order) {
		super(order);
	}

	@Override
	public void Invoice() {
		_order.DoInvoice();
		_order.SetOrderState(new Invoiced(_order));
	}
}
