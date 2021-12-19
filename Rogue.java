package com.company;

public class Rogue extends Warrior {
    Rogue() {
        super(50, 20);
        this.weapon = new NoWeaponBehaviour();
        this.className = "Rogue";
        this.power = 2.0;
        this.intellect = 5.0;
        this.agility = 14.0;
    }

    double attack() {
        if( weapon.clss()==ClassOfWeapon.AgilityWeapon)
            return (super.attack() + this.agility+4)*2;
            else {
                if( weapon.clss()==ClassOfWeapon.PowerWeapon)
                    return 4+super.attack() + this.power;
                if ( weapon.clss()==ClassOfWeapon.IntWeapon) {
                    return 4+super.attack() + this.intellect;
                }
            }
            return  4;
        }
}
