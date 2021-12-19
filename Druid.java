package com.company;

enum DruidState {
    human,
    bear,
    owl,
    cat
};

public class Druid extends Warrior {
    DruidState sh = DruidState.human;
    double special = 20;
    double agInc = 30;
    double intInc = 30;
    double powInc = 30;
   Druid(DruidState sh) {
        super(10.0, 29.0);
        this.weapon = new NoWeaponBehaviour();
        this.className = "Druid";
        this.power = 3.0;
        this.intellect = 7.0;
        this.agility = 2.0;
        setDruidState(sh);
    }


    double attack() {
       System.out.println("Specific indicator (Spirit) increases damage + 20:");
        if( weapon.clss()==ClassOfWeapon.PowerWeapon)
            return (super.attack() + this.power+7)*2;
        else {
            if( weapon.clss()==ClassOfWeapon.AgilityWeapon)
                return 7+super.attack() + this.agility +special;
            if ( weapon.clss()==ClassOfWeapon.IntWeapon) {
                return 7+super.attack() + this.intellect+special;
            }
        }
        return  7;

    }


    void setDruidState(DruidState sh){
       if (sh == this.sh) return;
       if(mp>10){
            switch (this.sh) {
                case cat -> this.agility = agility - agInc;
                case bear -> this.power = power - powInc;
                case owl -> this.intellect = intellect - intInc;
                case human -> {}
                default -> throw new IllegalStateException("Unexpected value: " + sh);
            }

            switch (sh) {
                case cat -> {
                    System.out.println("\n" + "Cat shape");
                    this.agility = agility + agInc;
                }
                case bear -> {
                    System.out.println("\n" + "Bear shape");
                    this.power = power + powInc;
                }
                case owl -> {
                    System.out.println("\n" + "Owl shape");
                    this.intellect = intellect + intInc;
                }
                case human -> {}
                default -> throw new IllegalStateException("Unexpected value: " + sh);
            }
            this.sh = sh;
            mp = mp - 10;
        }
         else
            System.out.println("\n" + "Mana is not enough");
    }
}
