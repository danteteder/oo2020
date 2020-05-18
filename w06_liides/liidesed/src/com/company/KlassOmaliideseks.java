package com.company;

public class KlassOmaliideseks  implements Omaliides {

    public void main(String[] args) {
        korrutamine(235, 450);
        jagamine(49901, 532);
    }

    public void korrutamine(int a, int b) {
        int vastus = a * b;
        System.out.println(vastus);
        
    }
    
    public void jagamine(double a, double b) {
        double vastus = a / b;
        System.out.println(vastus);

    }

    @Override
    public void korrutamine() {

    }

    @Override
    public void jagamine() {

    }
}
