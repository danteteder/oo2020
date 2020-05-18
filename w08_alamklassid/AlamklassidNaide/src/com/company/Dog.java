package com.company;

public class Dog extends Pet {
    public String species = "Dog";
    public String name = "Schpoopy";
    public int hours = 8;

    @Override
    public void beingAliveAsAPet() {
        super.beingAliveAsAPet();

        System.out.println(" My name is " + name + " i'm a " + species);
        System.out.println(" I sleep around " + hours);


    }

    @Override
    public void communicate() {

    }

    @Override
    public void move() {

    }

    @Override
    public void howManyHoursIsleep(int hours) {

    }
}
