package org.amm.dp.budai.creational.singleton;

/**
 * Singleton Eager init
 *
 */
public enum LoggerSingletonEnum {
	INSTANCE;
	
	private int _logCount = 0;
	
	private LoggerSingletonEnum(){
	}

	public void Log(String message) {
		System.out.println(_logCount + ": " + message);
		_logCount++;
	}
}
