package com.n11.oop;

public class Eye {
	
    public String color;
    public String retina;
    public int eyeHight;
    public int eyeWidth;

    public Eye(String color)
    {
        this.color = color;
    }

    public Eye(String color,String retina,int eyeHight,int eyeWidth)
    {
        this.color = color;
        this.retina = retina;
        this.eyeWidth = eyeWidth;
        this.eyeHight = eyeHight;
    }
}