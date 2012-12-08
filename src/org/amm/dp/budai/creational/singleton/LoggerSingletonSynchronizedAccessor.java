package org.amm.dp.budai.creational.singleton;

/**
 * Singleton lazy init
 * 
 * SynchronizedAccessor
 */
public class LoggerSingletonSynchronizedAccessor {

	private int _logCount = 0;
	private static LoggerSingletonSynchronizedAccessor _loggerSingletonInstance = null;

	private LoggerSingletonSynchronizedAccessor() {
	}

	public static synchronized LoggerSingletonSynchronizedAccessor GetInstance() {
		if (_loggerSingletonInstance == null) {
			_loggerSingletonInstance = new LoggerSingletonSynchronizedAccessor();
		}
		return _loggerSingletonInstance;
	}

	public void Log(String message) {
		System.out.println(_logCount + ": " + message);
		_logCount++;
	}
}
