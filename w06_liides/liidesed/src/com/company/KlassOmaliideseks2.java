package com.company;

public abstract class KlassOmaliideseks2 implements Omaliides {

    public void main(String[] args) {
        korrutamine(50, 3590);
        jagamine(5091331, 51903);



    }


    public void korrutamine(int a, int b) {
        int vastus = a * b;
        System.out.println("Korrutamise vastus on " + vastus);
    }

    public void jagamine(int a, int b) {
        int vastus = a/ b;
        System.out.println("Jagamise vastus on " + vastus);

    }

}
