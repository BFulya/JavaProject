//Cocuk.java

package com.n11.oop;

public class Child extends Human {

    public String qualification;

    public void writeNameSurnameQualification(String name,String surname,String qualification)
    {
        System.out.println(name+ " " + surname+" " + qualification);
    }
}