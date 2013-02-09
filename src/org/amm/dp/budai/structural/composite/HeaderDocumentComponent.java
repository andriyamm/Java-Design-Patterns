package org.amm.dp.budai.structural.composite;

import java.util.Calendar;

public class HeaderDocumentComponent implements IDocumentComponent {
	public String GatherData() {
		return String.format("<Header><MessageTime>%s</MessageTime></Header>",
				Calendar.getInstance().getTime().toString());
	}

	public void AddComponent(IDocumentComponent documentComponent) {
		System.out.println("Cannot add to leaf...");
	}
}
