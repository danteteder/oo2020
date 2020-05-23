package com.company;

import java.util.logging.Logger;

public class Tunnitoo {

    public static void main(String[] args) {


        try {
            //statements that might cause exceptions
            //possibly including function calls
            int buckets[] = new int[15];
            buckets[16] = 38 / 6;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error kui jagab potentsiaalselt nulliga");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("16 on deklareeritud arrays väljas");
        } catch (Exception e) {
            System.out.println("Kõik errorid catchib");
        } finally {
            System.out.println("Kui exception juhtub või mitte, finally block alati executeib");
        }












    }


}
