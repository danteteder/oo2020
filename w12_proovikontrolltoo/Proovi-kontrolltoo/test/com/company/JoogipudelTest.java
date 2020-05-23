package com.company;

import static org.junit.jupiter.api.Assertions.*;

class JoogipudelTest {

    //Testin nimi õige
    @org.junit.jupiter.api.Test
    void massJaJook() {
        Jook cocaJook = new Jook("Coca", 3.0f, 0.5f);
        Joogipudel coca = new Joogipudel(0.5f,0.5f,0.2f, "Vaike", cocaJook);
        //ehk kui nimi siin vahetada siis failib testi
        assertEquals("Coca", cocaJook.getName());
        //testin et pudeli suurus ei oleks gigasuur ¯\_(ツ)_/¯
        assertNotEquals("Gigasuur", coca.pudeliType());
    }

    @org.junit.jupiter.api.Test
    void maht() {
    }

    @org.junit.jupiter.api.Test
    void mass() {
    }

    @org.junit.jupiter.api.Test
    void taaramaksuvus() {
    }

    @org.junit.jupiter.api.Test
    void pudeliType() {
    }

    @org.junit.jupiter.api.Test
    void jook() {
    }

    @org.junit.jupiter.api.Test
    void joogiHind() {
    }

}