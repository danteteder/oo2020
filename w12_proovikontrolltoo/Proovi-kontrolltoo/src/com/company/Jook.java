package com.company;

public class Jook {

    private String name;
    private float liitriHindEur;
    private float erikaal;

    //tyhi constructor
    public Jook() {
    }


    //teine constructor
    public Jook(String name, float liitriHindEur, float erikaal) {
        this.name = name;
        this.liitriHindEur = liitriHindEur;
        this.erikaal = erikaal;
    }

    //getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLiitriHindEur() {
        return liitriHindEur;
    }

    public void setLiitriHindEur(float liitriHindEur) {
        this.liitriHindEur = liitriHindEur;
    }

    public float getErikaal() {
        return erikaal;
    }

    public void setErikaal(float erikaal) {
        this.erikaal = erikaal;
    }


    //
    public Jook name(String name) {
        this.name = name;
        return this;
    }

    public Jook liitriHindEur(float liitriHindEur) {
        this.liitriHindEur = liitriHindEur;
        return this;
    }

    public Jook erikaal(float erikaal) {
        this.erikaal = erikaal;
        return this;
    }

}
