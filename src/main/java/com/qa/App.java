package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        // comment line
        System.out.println(sayHelloToSomeone("Alice"));
        System.out.println(sayHelloToSomeone("Bob"));
        System.out.println(sayHelloToSomeone("Charlie"));
        System.out.println(sayHelloToSomeone("Zena"));
        System.out.println(sayHelloToSomeone("Pranav"));
        System.out.println(sayHelloToSomeone("LBG"));
        System.out.println(sayHelloToSomeone("Gayathiri"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!, See you Soon";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
