package com.company;

public class Mage extends Warrior {
    Mage() {
        super(50, 20);
        this.weapon = new NoWeaponBehaviour();
        this.className = "Mage";
        this.power = 2.0;
        this.intellect = 15.0;
        this.agility = 1.0;
    }

    double attack() {
        if( weapon.clss()==ClassOfWeapon.IntWeapon)
            return (super.attack() + this.intellect+3)*2;
        else {
            if( weapon.clss()==ClassOfWeapon.PowerWeapon)
                return 3+super.attack() + this.power;
            if ( weapon.clss()==ClassOfWeapon.AgilityWeapon) {
                return 3+super.attack() + this.agility;
            }
        }
        return  3;
    }
}
