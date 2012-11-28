package org.amm.dp.budai.creational.factorymethod;

public interface ILogger {
	
	void LogMessage(String message);
	void LogError(String message);
	void LogVerboseInformation(String message);
	
}
