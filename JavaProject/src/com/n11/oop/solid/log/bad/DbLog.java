package com.n11.oop.solid.log.bad;

public class DbLog {

    public boolean dbRecord(String value)
    {
        //processes
        System.out.println(value + " recorded to database.");
        return true;
    }

}