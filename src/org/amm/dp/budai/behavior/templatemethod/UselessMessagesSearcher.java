package org.amm.dp.budai.behavior.templatemethod;

import java.util.Date;

public class UselessMessagesSearcher extends MessagesSearcher {
	
	public UselessMessagesSearcher(Date dateSent, String personName) {
		super(dateSent, personName, 1);// 1 означає в пень комусь треба
	}

	// одна операція перегружена (USELESS в кінці)
	@Override
	protected void CreateImportanceCriteria() {
		System.out
				.println("Special importance criteria has been formed: USELESS");
	}
}
