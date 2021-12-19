package com.company;

enum ClassOfWeapon { NoWeapon, PowerWeapon, AgilityWeapon, IntWeapon};

public interface Weapon {
    double attack();
    ClassOfWeapon clss();
    String name();
}
