package org.amm.dp.budai.behavior.templatemethod;

import java.util.Date;

public class MessagesSearcher {

	protected Date DateSent;
	protected String PersonName;
	protected int ImportanceLevel;

	public MessagesSearcher(Date dateSent, String personName,
			int importanceLevel) {
		DateSent = dateSent;
		PersonName = personName;
		ImportanceLevel = importanceLevel;
	}

	// базові операції (primitive operations)
	protected void CreateDateCriteria() {
		System.out.println("Standard date criteria has been applied.");
	}

	protected void CreateSentPersonCriteria() {
		System.out.println("Standard person criteria has been applied.");
	}

	protected void CreateImportanceCriteria() {
		System.out.println("Standard importance criteria has been applied.");
	}

	// ШАБЛОННИЙ МЕТОД
	public String Search() {
		CreateDateCriteria();
		CreateSentPersonCriteria();
		System.out
				.println("Template method does some verification accordingly to search algo.");
		CreateImportanceCriteria();
		System.out
				.println("Template method verifies if message could be so important or useless from person provided in criteria.");
		System.out.println();
		return "Some list of messages...";
	}
}