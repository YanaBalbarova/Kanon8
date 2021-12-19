package com.company;

public class Warrior {
    String className;
    double hp;
    double mp;

    double intellect;
    double power;
    double agility;

    Weapon weapon;

    Warrior(double hp, double mp) {
        this.hp = hp;
        this.mp = mp;
        this.className = "Simple guy";
    }

    double attack() {
            return weapon.attack();
    }

    @Override
    public String toString() {
        return " Warrior { " +
                " Name : " + className +
                ", hp = " + hp +
                ", mp = " + mp +
                ", intellect = " + intellect +
                ", power = " + power +
                ", agility = " + agility +
                ", weapon = " + weapon.getClass().getSimpleName() +
                '}';
    }

    void info() {
        System.out.println(this.toString());
    }
    void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
