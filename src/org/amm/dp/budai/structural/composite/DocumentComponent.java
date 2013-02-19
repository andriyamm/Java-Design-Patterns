package org.amm.dp.budai.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DocumentComponent implements IDocumentComponent {
	
	public String name;
	public List<IDocumentComponent> documentComponents;

	public DocumentComponent(String name) {
		this.name = name;
		documentComponents = new ArrayList<IDocumentComponent>();
	}

	public String GatherData() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("<%s>", name));

		for (IDocumentComponent documentComponent : documentComponents) {
			documentComponent.GatherData();
			stringBuilder.append(documentComponent.GatherData());
		}
		stringBuilder.append(String.format("</%s>", name));
		return stringBuilder.toString();
	}

	public void AddComponent(IDocumentComponent documentComponent) {
		documentComponents.add(documentComponent);
	}

	// getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IDocumentComponent> getDocumentComponents() {
		return documentComponents;
	}

	public void setDocumentComponents(
			List<IDocumentComponent> documentComponents) {
		this.documentComponents = documentComponents;
	}
}
