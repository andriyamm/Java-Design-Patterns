package org.amm.dp.budai.behavior.templatemethod;

import java.util.Date;

public class ImportantMessagesSearcher extends MessagesSearcher {
	
	public ImportantMessagesSearcher(Date dateSent, String personName) {
		super(dateSent, personName, 3); // 3 означає що повідомлення важливе
	}

	// одна операція перегружена (IMPORTANT в кінці)
	@Override
	protected void CreateImportanceCriteria() {
		System.out
				.println("Special importance criteria has been formed: IMPORTANT");
	}
}
