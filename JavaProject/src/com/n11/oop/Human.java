//Human.java
package com.n11.oop;

public class Human {

    public String name;
    public String surname;
    public int age;
    public double salary;
    public boolean gender;


    public void sleep()
    {
        System.out.println("Sleeping");
    }

    public void printScreen(String name,String surname)
    {
        System.out.println("Person' name:" + name+ "Person' surname : " + surname);
    }

}