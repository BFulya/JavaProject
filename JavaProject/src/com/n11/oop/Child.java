//Cocuk.java

package com.n11.oop;

public class Child extends Human {

    public String title;

    public void writeNameSurnameTitle(String name,String surname,String title)
    {
        System.out.println(name+ " " + surname+" " + title);
    }
}