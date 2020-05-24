package com.company;

import java.util.List;

public class Generics {
    //<T> - parameeter tüüp, mille võtame listi sisse
    public static <T> T getFirst(List<T> list){
        return list.get(0);
    }

    //Meil on type mis extendib Vehiclet ja meetod getWheels T tüübiga
    public static <T extends Vehicle> int getWheels(T type) {
        return type.wheels;
    }

    //
    public static <T> String getType(T type){
        return type.getClass().getSimpleName();
    }


}
