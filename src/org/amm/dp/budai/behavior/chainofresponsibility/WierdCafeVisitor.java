package org.amm.dp.budai.behavior.chainofresponsibility;

public abstract class WierdCafeVisitor {
	public WierdCafeVisitor CafeVisitor;

	protected WierdCafeVisitor(WierdCafeVisitor cafeVisitor) {
		CafeVisitor = cafeVisitor;
	}

	public WierdCafeVisitor getCafeVisitor() {
		return CafeVisitor;
	}

	public void setCafeVisitor(WierdCafeVisitor cafeVisitor) {
		CafeVisitor = cafeVisitor;
	}

	public void HandleFood(Food food) {
		// If I cannot handle other food, passing it to my successor
		if (CafeVisitor != null) {
			CafeVisitor.HandleFood(food);
		}
	}
}