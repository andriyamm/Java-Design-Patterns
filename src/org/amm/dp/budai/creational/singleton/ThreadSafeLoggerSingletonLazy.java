package org.amm.dp.budai.creational.singleton;

/**
 * Singleton lazy init
 * 
 * Double Checked Locking & volatile
 */
public class ThreadSafeLoggerSingletonLazy {

	private int _logCount = 0;
	private static volatile ThreadSafeLoggerSingletonLazy instance;

	public static ThreadSafeLoggerSingletonLazy getInstance() {

		ThreadSafeLoggerSingletonLazy localInstance = instance;
		if (localInstance == null) {
			synchronized (ThreadSafeLoggerSingletonLazy.class) {
				localInstance = instance;
				if (localInstance == null) {
					instance = localInstance = new ThreadSafeLoggerSingletonLazy();
				}
			}
		}
		return localInstance;
	}
	
	public void Log(String message) {
		System.out.println(_logCount + ": " + message);
		_logCount++;
	}
}
