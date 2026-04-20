package com.n11.oop;

public class Head {
    public Eye eye;
    public String eyeColor;
    public Ears ears;
    public Nose nose;


    public Head(Eye eye, Ears ears, Nose nose)
    {
        this.eye = eye;

        this.ears = ears;
        this.nose = nose;

    }
    public Head(String eyeColor,String retina,int eyeHight,int eyeWidth, Ears ears, Nose nose)
    {
        this.eyeColor = eyeColor;
        this.ears = ears;
        this.nose = nose;
        //this.retina = retina;
        //this.eyeHight = eyeHight;
        // this.eyeWidth = eyeWidth;
    }

}