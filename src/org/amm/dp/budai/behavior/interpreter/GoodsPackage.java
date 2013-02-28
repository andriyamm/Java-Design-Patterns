package org.amm.dp.budai.behavior.interpreter;

import java.util.ArrayList;
import java.util.List;

//Nonterminal expression
public class GoodsPackage extends Goods {
	
	public List<Goods> GoodsInside;

	public GoodsPackage() {
		super();
		GoodsInside = new ArrayList<Goods>();
	}

	public GoodsPackage(List<Goods> goodsInside) {
		super();
		GoodsInside = goodsInside;
	}

	@Override
	public int Interpret(CurrentPricesContext context) {
		int totalSum = 0;
		for (Goods goods : GoodsInside) {
			totalSum += goods.Interpret(context);
		}
		return totalSum;
	}
}
