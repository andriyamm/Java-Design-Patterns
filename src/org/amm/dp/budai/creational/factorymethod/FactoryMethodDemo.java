package org.amm.dp.budai.creational.factorymethod;

public class FactoryMethodDemo {
	
	public static void Run() {
		// providerType = GetTypeOfLoggingProviderFromConfigFile();
		ILogger logger = LoggerProviderFactory
				.GetLoggingProvider(LoggingProviders.Enterprise);
		logger.LogMessage("Hello Factory Method Design Pattern.");
	}

	// private static LoggingProviders GetTypeOfLoggingProviderFromConfigFile()
	// {
	// return LoggingProviders.Log4Net;
	// }

}
