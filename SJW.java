package com.company;

public class SJW extends Warrior {
    SJW(){
        super(1,1);
        this.intellect = 1;
        this.power = 1;
        this.agility = 1;

        this.weapon = new NoWeaponBehaviour();
    }

    @Override
    double attack() {
        if( weapon.clss()==ClassOfWeapon.PowerWeapon)
            return 1+super.attack() + this.power;
        else {
            if( weapon.clss()==ClassOfWeapon.IntWeapon)
                return 1+super.attack() + this.agility;
            if ( weapon.clss()==ClassOfWeapon.AgilityWeapon) {
                return 1+super.attack() + this.intellect;
            }
        }
        return  1;
    }
}
