package org.amm.dp.budai.creational.singleton;

public class ThreadSafeLoggerSingletonLazy {
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
}
