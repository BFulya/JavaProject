package com.n11.oop.solid.log.good;

public class Test {
	 public static void main(String[] args)
	    {
	        DbLog dbLog = new DbLog();
	        XmlLog xml= new XmlLog();
	        TextLog text = new TextLog();
	        Logger logger = new Logger(text);
	        logger.WriteLog("303 Error code occurred");


	    }

}
