package com.n11.oop.annotation;

import java.lang.annotation.Annotation;

@InformationRuntime(information = "Annotation example",date="21.04.2026", author="fulya bilgeç")

public class TestAnnotation {

    public static void main(String[] args) {

        Class<?> c;
        try
        {
            c = Class.forName("com.n11.oop.annotation.TestAnnotation");
            Annotation[] ann = c.getDeclaredAnnotations();
            for(Annotation a : ann)
            {
                Class<?> annType =  a.annotationType();
                System.out.println("Annotation type : " +annType);
            }

            InformationRuntime  infoAnn = c.getAnnotation(InformationRuntime.class);
            System.out.println("Information : " + infoAnn.information());
            System.out.println("Date : " + infoAnn.date());
            System.out.println("Author : " + infoAnn.author());


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }
}