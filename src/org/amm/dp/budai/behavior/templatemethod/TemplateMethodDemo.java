package org.amm.dp.budai.behavior.templatemethod;

import java.util.Date;

public class TemplateMethodDemo {
	
	public static void main(String[] args) {
		
		MessagesSearcher searcher = new UselessMessagesSearcher(new Date(),
				"Sally");
		searcher.Search();
		
		searcher = new ImportantMessagesSearcher(new Date(), "Killer");
		searcher.Search();
	}
}