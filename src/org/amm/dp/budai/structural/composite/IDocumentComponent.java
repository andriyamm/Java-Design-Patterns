package org.amm.dp.budai.structural.composite;

interface IDocumentComponent {
	
	String GatherData();

	void AddComponent(IDocumentComponent documentComponent);
}
