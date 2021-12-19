package com.company;

public class AgWeapon implements Weapon{
    public double attack() {
        return 0;
    }

    public ClassOfWeapon clss(){
        return ClassOfWeapon.AgilityWeapon;
    }

    public String name() {
        return "No";
    }
}
