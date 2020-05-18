package com.company;

public class Character2 implements CharacterBehaviour {

    //saab olla mitu maini
    // kuna parameetrid on erinevad siis java lubab teha seda - see on overflowing

    //Esimene main meetod võtab kõik sisse nagu massiivi, sellepärast on String[]
    public static void main(String[] args) {

    }

    public static void main(String arg1) {

    }

    public static void main(String arg1, String arg2) {

    }

    //sama kuju nagu interfaces aga meie anname uue sisu siin Character2 klassis
    @Override
    public void move() {

    }

    @Override
    public void changeDirection() {

    }

    @Override
    public void speak() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int[] getXY() {
        return new int[0];
    }
}
