package org.amm.dp.budai.creational.singleton;

public class SingletonDemo
{
    public static void main(String[] args)
    {
        DoHardWork();
    }

    public static void DoHardWork()
    {
        LoggerSingleton logger = LoggerSingleton.GetInstance();
    	//LoggerSingletonEagerInit logger = LoggerSingletonEagerInit.GetInstance();
    	//LoggerSingletonSynchronizedAccessor logger = LoggerSingletonSynchronizedAccessor.GetInstance();
    	//ThreadSafeLoggerSingletonLazy logger = ThreadSafeLoggerSingletonLazy.GetInstance();
    	//Singleton logger = Singleton.getInstance();
        
        HardProcessor processor = new HardProcessor(1);
        logger.Log("Hard work started...");
        processor.ProcessTo(5);
        logger.Log("Hard work finished...");
    }
    
    
//A main method that spawns multiple threads calling getInstance():
//    public static void main(String[] args) {
//    	   int numOfThreads = Integer.parseInt(args[0]);
//    	   for(int i = 0; i < numOfThreads; i++) {
//    	     Thread t = new Thread(new Runnable() {
//    	       public void run() {
//    	         System.out.println(MySingleton1.getInstance());
//    	       }
//    	     });
//    	     t.start();
//    	   }
//    	 }
}
