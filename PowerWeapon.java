package com.company;

public class PowerWeapon implements Weapon{
    public double attack() {
        return 0;
    }

    public ClassOfWeapon clss(){
        return ClassOfWeapon.PowerWeapon;
    }

    public String name() {
        return "No";
    }
}
