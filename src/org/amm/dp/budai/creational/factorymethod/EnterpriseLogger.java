package org.amm.dp.budai.creational.factorymethod;

public class EnterpriseLogger implements ILogger {

	@Override
	public void LogMessage(String message) {
		System.out.printf("EnterpriseLogger_message %s ", message);

	}

	@Override
	public void LogError(String message) {
		System.out.printf("EnterpriseLogger_Error %s ", message);

	}

	@Override
	public void LogVerboseInformation(String message) {
		System.out.printf("EnterpriseLogger_Information %s ", message);

	}

}
