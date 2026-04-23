package com.n11.oop.solid.log.good;

public class LogFactory {
    @SuppressWarnings("deprecation")
    public ILog create(String className)
    {
        Class c;
        ILog iLogType=null;

        try
        {
            c  = Class.forName("com.n11.oop.solid.log.good."+className);
            iLogType = (ILog) c.newInstance();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return iLogType;

    }
}