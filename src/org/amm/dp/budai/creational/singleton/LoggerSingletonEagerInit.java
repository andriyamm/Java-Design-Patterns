package org.amm.dp.budai.creational.singleton;

public class LoggerSingletonEagerInit {
	private int _logCount = 0;
	private static final LoggerSingletonEagerInit instance = new LoggerSingletonEagerInit();

	private LoggerSingletonEagerInit() {
	}

	public static LoggerSingletonEagerInit getInstance() {
		return instance;
	}

	public void Log(String message) {
		System.out.println(_logCount + ": " + message);
		_logCount++;
	}
}
