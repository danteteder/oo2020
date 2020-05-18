package com.company;

public class Main {

    public static void main(String[] args) {
        Dog doggie1 = new Dog();
        doggie1.beingAliveAsAPet();


        // new instance
        //aka abstract classes annavad common meetodi imlementatsiooni
        Dog doggie2 = new Dog();
        doggie2.name = "Schmeckles";
        doggie2.species = "Galaxy Dog";
        doggie2.beingAliveAsAPet();
    }

    //self note:
    // If a number of classes implement some interface, but all of them implement the same method in the same way using the same code,
    // then what is commonly done is to create an abstract class that contains the common implementation,
    // and get all of the concrete implementations to extend that class.
}
