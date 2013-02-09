package org.amm.dp.budai.behavior.state;

import java.util.ArrayList;
import java.util.List;

import org.amm.dp.budai.behavior.state.Order.Invoiced;

public class Order {
	
	private OrderState _state;
	private List<Product> _products = new ArrayList<Product>();

	public Order() {
		_state = new NewOrder(this);
	}

	public void SetOrderState(OrderState state) {
		_state = state;
	}

	public void WriteCurrentStateName() {
		System.out.println("Current Order's state: {0}", _state.GetType().name);
	}

	//
	public void AddProduct(Product product) {
		_products.add(product);
		_state.AddProduct();
	}

	public void Register() {
		_state.Register();
	}

	public void Grant() {
		_state.Grant();
	}

	public void Ship() {
		_state.Ship();
	}

	public void Invoice() {
		_state.Invoice();
	}

	public void Cancel() {
		_state.Cancel();
	}

	public void DoShipping() {
		System.out.println("Shipping...");
	}

	public void DoAddProduct() {
		System.out.println("Adding product...");
	}

	public void DoCancel() {
		System.out.println("Cancelation...");
	}

	public void DoGrant() {
		System.out.println("Granting...");
	}

	public void DoRegister() {
		System.out.println("Registration...");
	}

	public void DoInvoice() {
		System.out.println("Invoicing...");
	}
}
