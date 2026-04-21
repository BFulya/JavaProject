package com.n11.oop.abstracts;

public class Test {

    public static void main(String[] args)
    {
      //  Animal a = new Animal();

        Cat k = new Cat();
        k.move();

        GeneralManager gm = new GeneralManager();
        gm.name = "Hakan";
        gm.surname = "Yılmaz";
        gm.departmant = "General Manager";

        Manager m = new Manager();
        Programmer p = new Programmer();
        Intern  i = new Intern();
        double total= 0;
        total = gm.yourSalary()+m.yourSalary()+p.yourSalary()+i.yourSalary();
        System.out.println(" Total : " + total+ " TL receives salaries");

        Employee[] employees = new Employee[4];
        employees[0] = gm;
        employees[1] = m;
        employees[2] = p;
        employees[3] = i;

        for(int j=0; j< employees.length;j++)
        {
            System.out.println("Employees' name : " + employees[j].name + " Surname : " + employees[j].surname + " Salary : " + employees[0].yourSalary());
        }

        Math ma = new Math();
        int comingValue = ma.sum(5,5);
        System.out.println("Sum of two number : " + comingValue);

    }
}