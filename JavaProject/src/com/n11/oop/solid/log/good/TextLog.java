package com.n11.oop.solid.log.good;

public class TextLog implements  ILog{
    @Override
    public String log(String value) {
        return value + " recorded to text";

    }
}