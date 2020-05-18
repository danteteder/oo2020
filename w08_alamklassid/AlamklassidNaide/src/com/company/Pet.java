package com.company;

public abstract class Pet {

    //halb näide i think aga shows abstract classes

    private String job = " being a pet ";

    public void canPetMove(){
        boolean isPetAlive = true;
        if(isPetAlive) {
            System.out.println("*Pet can move*," + " its job is " + this.job);
        }
    }

    public abstract void communicate(); //abstract sest iga pet kommunikeerib teistmoodi
    public abstract void move(); //jne
    public abstract void howManyHoursIsleep(int hours); //nt unit of time oleks hours

    public void beingAliveAsAPet(){
        System.out.println("*Pet can move*" + "*its job is" + this.job);

        //what kind of pet r they?
        //
        //

    }


}
