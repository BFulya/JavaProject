package com.n11.oop.solid.log.good;

public class Logger {

    private ILog iLog;

    public Logger(ILog iLog)
    {
        this.iLog = iLog;
    }

    public String WriteLog(String message)
    {
       return this.iLog.log(message);
    }
}