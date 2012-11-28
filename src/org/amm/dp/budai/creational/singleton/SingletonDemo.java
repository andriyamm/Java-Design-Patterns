package org.amm.dp.budai.creational.singleton;

public class SingletonDemo
{
    public static void Run()
    {
        DoHardWork();
    }

    public static void DoHardWork()
    {
        LoggerSingleton logger = LoggerSingleton.GetInstance();
        HardProcessor processor = new HardProcessor(1);
        logger.Log("Hard work started...");
        processor.ProcessTo(5);
        logger.Log("Hard work finished...");
    }
}
