package com.n11.oop.solid.log.bad;

public class TextLog {

    public boolean textRecord(String value)
    {
        //processes
        System.out.println(value + " recorded to text.");
        return true;
    }
}