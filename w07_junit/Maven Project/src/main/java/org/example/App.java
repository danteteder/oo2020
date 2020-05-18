package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

/**
 * Hello world!
 *
 */
public class App {
    private static String name;

    public App(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int maxValue(int a, int b){
        return a > b ? a : b;
    }

        public static void main( String[] args)

        {
            Result result;
            result = JUnitCore.runClasses(App.class);
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
            System.out.println("Result=="+result.wasSuccessful());


            System.out.println( "Hello World!" );
        }
}
