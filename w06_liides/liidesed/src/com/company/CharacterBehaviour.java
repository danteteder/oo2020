package com.company;

public interface CharacterBehaviour {
    //juhis kuidas mingid asjad peaks toimima on interfac
    //interface - lubadus implementeerida mingi käitumine
        //see on hea ka sellepärast, et tekib mingisugune hierarhia, lõpus on mingi ühendav kogu

        //peab initializima
        //ei saa olla int x;
        int x = 5;

        public void move();
        //nagu blueprint on
        public void changeDirection();
        public void speak();
        public String getName();
        int[] getXY();


}
