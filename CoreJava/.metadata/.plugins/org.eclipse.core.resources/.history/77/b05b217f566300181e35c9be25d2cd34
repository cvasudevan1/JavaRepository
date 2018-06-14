package com.learn.basicjava;

class StaticComponentsStatic
{
     static int staticVariable;
 
     static
     {
          System.out.println("StaticComponents SIB");
          staticVariable = 10;
     }
 
     static void staticMethod()
     {
          System.out.println("From StaticMethod");
          System.out.println(staticVariable);
     }
}
 
public class StaticComponents
{
     static
     {
          System.out.println("MainClass SIB");
     }
 
     public static void main(String[] args)
     {
         //Static Members directly accessed with Class Name
    	 StaticComponentsStatic.staticVariable = 20;
    	 StaticComponentsStatic.staticMethod();
     }
}