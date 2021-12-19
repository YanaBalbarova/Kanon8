package com.company;

public class IntellectWeapon implements Weapon{
    public double attack() {
        return 0;
    }
    public ClassOfWeapon clss(){
        return ClassOfWeapon.IntWeapon;
    }

    public String name() {
        return "No";
    }
}
