package com.company;

public class Knight extends Warrior {


    Knight() {
        super(100, 0);
        this.weapon = new NoWeaponBehaviour();
        this.className = "Knight";
        this.power = 5.0;
        this.intellect = 3.0;
        this.agility = 2.0;
    }


    double attack() {
        if( weapon.clss()==ClassOfWeapon.PowerWeapon)
            return (super.attack() + this.power+10)*2;
        else {
            if( weapon.clss()==ClassOfWeapon.AgilityWeapon)
                return 10+super.attack() + this.agility;
            if ( weapon.clss()==ClassOfWeapon.IntWeapon) {
                return 10+super.attack() + this.intellect;
            }
        }
        return  10;
    }
}
