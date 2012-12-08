package org.amm.dp.budai.creational.singleton;

/**
 * Singleton lazy init
 *
 */
public class LoggerSingleton {
	
	private int _logCount = 0;
	private static LoggerSingleton _loggerSingletonInstance = null;
	
	private LoggerSingleton() {
	}

	public static LoggerSingleton GetInstance() {
		if (_loggerSingletonInstance == null) {
			_loggerSingletonInstance = new LoggerSingleton();
		}
		return _loggerSingletonInstance;
	}

	public void Log(String message) {
		System.out.println(_logCount + ": " + message);
		_logCount++;
	}
}
