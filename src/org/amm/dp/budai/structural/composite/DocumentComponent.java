package org.amm.dp.budai.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DocumentComponent implements IDocumentComponent {
	
	public String Name;
	public List<IDocumentComponent> DocumentComponents;

	public DocumentComponent(String name) {
		Name = name;
		DocumentComponents = new ArrayList<IDocumentComponent>();
	}

	public String GatherData() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("<{0}>", Name));

		for (IDocumentComponent documentComponent : DocumentComponents) {
			documentComponent.GatherData();
			stringBuilder.append(documentComponent.GatherData());
		}
		stringBuilder.append(String.format("</{0}>", Name));
		return stringBuilder.toString();
	}

	public void AddComponent(IDocumentComponent documentComponent) {
		DocumentComponents.add(documentComponent);
	}

	// getters and setters
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<IDocumentComponent> getDocumentComponents() {
		return DocumentComponents;
	}

	public void setDocumentComponents(
			List<IDocumentComponent> documentComponents) {
		DocumentComponents = documentComponents;
	}
}
