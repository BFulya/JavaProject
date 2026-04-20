//main.java
package com.n11.oop;

public class Main {
    public static void main(String[] args) {


        //ClassName objectName = new ClassName();

        Human i = new Human();
        i.name = "Fulya";
        i.surname = "Karaduman";
        i.age = 25;
        i.salary = 3.14;
        i.gender = true;
        i.sleep();

        Mother a = new Mother();
        a.name = "Songül";
        a.surname = "Karaduman";
        a.printScreen(a.name,a.surname);
        Father b = new Father();
        b.name = "Şahin";
        b.surname = "Karaduman";
        b.printScreen(b.name,b.surname);
        Child c = new Child();
        c.name = "Fulya";
        c.surname = "Karaduman";
        c.printScreen(c.name,c.surname);

        
        
        CleverChild cc = new CleverChild();
        cc.name = "Yannis";
        cc.surname = "Karaduman";
        cc.title = "Clever";
        cc.writeNameSurnameTitle(cc.name,cc.surname,cc.title);
        
        DocileChild dc = new DocileChild();
        dc.writeNameSurnameTitle("John","Doe","Is a Docile Child");

    }
}


