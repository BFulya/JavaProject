package com.n11.oop.collections;

import com.n11.oop.Human;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args)
    {

        ArrayList<String> list = new ArrayList<String>();
        Human h = new Human();
        list.add("Kevin");

        if(list.contains(h))
        {
            System.out.println("exist in List ");
        }
        else
        {

        }


        ArrayList<Staff> staffList = new ArrayList<Staff>();
        Staff p1 = new Staff("john","doe",3000);
        Staff p2 = new Staff("jane","done",4000);
        staffList.add(p1);
        staffList.add(p2);
        staffList.add(new Staff("mary","lou",5000));
        double sumOfSalary=0.0;
        for(Staff p : staffList)
        {
            System.out.println("Staff's name : "+ p.name+ " surname : " +p.surname+ " salary : " +p.salary);
            sumOfSalary+= p.salary;
        }
        System.out.println("Sum of salary : " +sumOfSalary);
    }
}