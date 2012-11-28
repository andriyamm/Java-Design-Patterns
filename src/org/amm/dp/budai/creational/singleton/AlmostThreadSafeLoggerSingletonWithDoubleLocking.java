package org.amm.dp.budai.creational.singleton;

public class AlmostThreadSafeLoggerSingletonWithDoubleLocking {
/*	private AlmostThreadSafeLoggerSingletonWithDoubleLocking() {
		// Читаємо дані із якогось файлу і дістаємо номер останнього запису
		// _logCount = вичитане значення
	}

	private int _logCount = 0;
	private static AlmostThreadSafeLoggerSingletonWithDoubleLocking _loggerInstance;

	public static AlmostThreadSafeLoggerSingletonWithDoubleLocking GetInstance()
    {
        if (_loggerInstance == null)
        {
            lock (_loggerInstance)
            {
                if (_loggerInstance == null)
                {
                    _loggerInstance = new AlmostThreadSafeLoggerSingletonWithDoubleLocking();
                }
            }
        }
        return _loggerInstance;
    }

	public void Log(String message) {
		System.out.println(_logCount + ": " + message);
		_logCount++;
	}*/
}
