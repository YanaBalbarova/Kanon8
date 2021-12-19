package com.company;

public class NoWeaponBehaviour implements Weapon {
    public NoWeaponBehaviour() {
    }

    public ClassOfWeapon clss(){
        return ClassOfWeapon.NoWeapon;
    }

    public double attack() {
        return 3;
    }

    public String name() {
        return "No weapon";
    }
}
