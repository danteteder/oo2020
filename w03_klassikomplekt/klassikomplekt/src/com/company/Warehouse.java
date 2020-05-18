package com.company;

public class Warehouse {

    private int amountOfFridges = 100;

    public void checkAmountOfFridges(){
        int niceAmount = this.amountOfFridges;
        if(niceAmount > 120){
            this.amountOfFridges = 120;
        }
    }

    public int getAmountOfFridges() {
        return this.amountOfFridges;
    }
}
