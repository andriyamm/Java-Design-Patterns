package org.amm.dp.budai.creational.factorymethod;

public class Log4NetLogger implements ILogger {
	
	public void LogMessage(String message) {
		System.out.printf("Log4Net_message %s ", message);
	}

	public void LogError(String message) {
		System.out.printf("Log4Net_Error %s ", message);

	}

	public void LogVerboseInformation(String message) {
		System.out.printf("Log4Net_Information %s ", message);

	}

}
