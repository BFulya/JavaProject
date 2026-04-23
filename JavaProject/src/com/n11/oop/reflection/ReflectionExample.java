package com.n11.oop.reflection;

import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try
        {
            Class cls = Class.forName("com.n11.oop.reflection.Trial");
            // Trial trial = new Trial();
            for(Method m: cls.getDeclaredMethods())
            {
                System.out.println("Method name : "+m.getName() + "\n"
                        +" return type : " +m.getReturnType()+ "\n"
                        +" Parameter number : " +m.getParameterCount());
            }

            Object obj = cls.newInstance();
            //We create an array in class type 
            //because when we call our method it wants argument from us 
            //We assign a parameter object to that type of array
            Class[] paramStringa = new Class[1];
            paramStringa[0] = String.class;

            //We call our method by passing the parameter array as follows
            Method m = cls.getMethod("showString", paramStringa);
            // When we call methods in the Reflection library, 
            //we pass parameters using the `invoke` method. 
            //As you may have noticed, we simply instantiated the `obj` object,
            //called the method at runtime,
            //and passed parameters via the `cls` reference.
            Object o = m.invoke(obj, new String("www.opendart.com"));
            // and first he ran the method and printed its contents; 
            //then let’s retrieve the method’s return value and print it
            String output = o.toString();
            System.out.println("En son method'un dönüş değeri  : " + output);
        }
        catch(Exception ex)
        {

        }
    }
}