package com.company;

public class Main {

    public static void main(String[] args) {
	Fridge kapp = new Fridge();
	kapp.setModel("Havana");
        System.out.println("Model is " + kapp.getModel());

     //tahaks kontrollida palju warehouse'is kylmkappe on
    Warehouse check = new Warehouse();
    check.checkAmountOfFridges();
        System.out.println("praegu on kylmkappe stockis" + check.getAmountOfFridges());

    }



}
