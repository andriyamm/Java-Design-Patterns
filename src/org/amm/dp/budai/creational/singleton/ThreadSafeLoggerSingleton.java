package org.amm.dp.budai.creational.singleton;

public class ThreadSafeLoggerSingleton
{
   /* private ThreadSafeLoggerSingleton()
    {
        // Читаємо дані із якогось файлу і дістаємо номер останнього запису
        // _logCount = вичитане значення
    }
    private int _logCount = 0;
    private static ThreadSafeLoggerSingleton _loggerInstance;
    private static readonly object locker = new object();

    public static ThreadSafeLoggerSingleton GetInstance()
    {
        lock (locker)
        {
            if (_loggerInstance == null)
            {
                _loggerInstance = new ThreadSafeLoggerSingleton();
            }
        }
        return _loggerInstance;
    }

    public void Log(String message)
    {
        System.out.println(_logCount + ": " + message);
        _logCount++;
    }*/
}
