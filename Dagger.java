package com.company;

public class Dagger extends AgWeapon {
    public Dagger() {
    }

    public double attack() {
        return 7.0;
    }

    public ClassOfWeapon clss(){
        return ClassOfWeapon.AgilityWeapon;
    }

    public String name() {
        return "Dagger";
    }
}
