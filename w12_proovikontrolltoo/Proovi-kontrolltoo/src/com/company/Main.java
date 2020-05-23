package com.company;

public class Main {

    public static void main(String[] args) {
        Jook cocaJook = new Jook("Coca", 3.0f, 0.5f);
        System.out.println("Joogiks on " + cocaJook.getName());


        Joogipudel coca = new Joogipudel(0.5f,0.5f,0.2f, "Vaike", cocaJook);
        System.out.println(coca.massJaJook());
    }
}
