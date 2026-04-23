package com.n11.oop.reflection;

public class Trial {

    private int number;

    public void show()
    {
        System.out.println("show() no parameter provoided");
    }

    public String gosterString(String temp)
    {
        System.out.println("showString() provoided parameter : " +temp);
        return temp;
    }

    public int gosterInteger(int temp)
    {
        System.out.println("showInteger() provoided parameter : " +temp);
        return temp;
    }

    public void setSayi(int sayi) {
        this.number = number;
        System.out.println("setNumber() setlenen sayi : " +number);
    }

    public void gosterSayi() {
        System.out.println("gosterSayi() : " +this.number);
    }


}