package com.company;

/** Koosta klass Jook, millel on nimetus, liitri omahind ning erikaal.
 * Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus.
 * Samuti sees olev Jook, mis võib ka puududa.
 * Koosta Joogipudeli jaoks käsklus, mis leiaks Joogipudeli massi koos Joogiga (juhul kui see olemas),
 * samuti käsklus sellise komplekti omahinna leidmiseks.
 * Koosta tööks automaattestid. *TODO* */


public class Joogipudel {

    //omadused 
    private float maht;
    private float mass;
    private String pudeliType;
    private float taaramaksuvus;

    public Jook jook;


    public Joogipudel(float maht, float mass, float taaramaksuvus, String pudeliType, Jook jook) {
        this.maht = maht;
        this.mass = mass;
        this.taaramaksuvus = taaramaksuvus;
        this.pudeliType = pudeliType;
        this.jook = jook;
    }

    public Joogipudel maht(float maht) {
        this.maht = maht;
        return this;
    }

    public Joogipudel mass(float mass) {
        this.mass = mass;
        return this;
    }

    public Joogipudel taaramaksuvus(float taaramaksuvus) {
        this.taaramaksuvus = taaramaksuvus;
        return this;
    }

    public Joogipudel pudeliType(String pudeliType) {
        this.pudeliType = pudeliType;
        return this;
    }

    public Joogipudel jook(Jook jook) {
        this.jook = jook;
        return this;
    }

    //kui jooki pole returnin ainult taaramaksuvuse
    //kui on siis selle hinna arvestades mahtu
    public float joogiHind(){
        if (jook==null) {
            return (taaramaksuvus);
        } else {
            return (jook.getLiitriHindEur() * maht);
        }
    }

    //leian joogipudeli massi kui jooki pole + kui on
    public String massJaJook(){
        if ((jook==null)) {
            System.out.println(("Tühja pudeli (jooki pole) mass on: " + mass));
        } else {
            return (jook.getName() + " mass on: " + mass + " ja hind on: " + joogiHind() );
        }


        return null;
    }


}
