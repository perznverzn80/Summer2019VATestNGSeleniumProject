package com.cybertek.tests.da14_Framework;

import org.testng.annotations.Test;

public class SingletonTest {
    @Test
    public  void test1(){

       //if you uncomment next line it will show a compilation error because we can not create object of that class
        //Singleton s=new Singleton();
        String s1=Singleton.getInstance();
        String s2=Singleton.getInstance();

        System.out.println("s1= "s1);
        System.out.println("s2= "s2);

    }
}
