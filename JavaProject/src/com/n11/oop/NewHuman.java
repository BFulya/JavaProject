package com.n11.oop;

public class NewHuman {

    public Head head;
    public String name;
    public String surname;

    public NewHuman(Head head,String name,String surname)
    {
        this.head = head;
        this.name = name;
        this.surname = surname;
    }

    public void printScreen()
    {
        System.out.println("Person's name ı: " + name+ " Surname: " + surname+ " eye color : "
                + head.eye.color+ " ears: " + head.ears.shape+ " nose : " + head.nose.shape);
    }


}