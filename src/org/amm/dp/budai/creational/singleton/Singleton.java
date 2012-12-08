package org.amm.dp.budai.creational.singleton;

/**
 * Singleton lazy init
 *
 */
public class Singleton {
    
	private int _logCount = 0;
	
    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }
        
    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
    
    public void Log(String message) {
		System.out.println(_logCount + ": " + message);
		_logCount++;
	}
}
