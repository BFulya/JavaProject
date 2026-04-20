package com.n11.oop;

public class Test {

    public static void main(String[] args)
    {

        Eye eye = new Eye("Brown","retina",20,20);
        Ears ears = new Ears("Ladle");
        Nose nose = new Nose("Arched nose");
        Head head = new Head(eye,ears,nose);
        NewHuman newHuman = new NewHuman(head,"Fulya","Uskovski");
        newHuman.printScreen();

    }
} 