package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n**************New Player***********************\n");
        Warrior s = new SJW();
        System.out.println(s.weapon.name() + " attack "+s.attack());
        System.out.println("\nAdd weapon");
        s.weapon = new Sword();
        System.out.println("\nWeapon name : "+s.weapon.name());
        System.out.println("Weapon attack : "+s.weapon.attack());
        System.out.println("Attack with weapon : "+s.attack()+"\n");
        s.info();

        System.out.println("\n**************New Player***********************\n");
        Warrior k = new Knight();
        System.out.println(k.weapon.name() + " attack "+k.attack());
        System.out.println("\nAdd weapon");
        k.weapon = new Sword();
        System.out.println("\nWeapon name : "+k.weapon.name());
        System.out.println("Weapon attack : "+k.weapon.attack());
        System.out.println("Attack with weapon: "+k.attack()+"\n");
        k.info();

        System.out.println("\n**************New Player***********************\n");
        Druid d = new Druid(DruidState.cat);
        System.out.println(d.weapon.name() + " attack "+d.attack());
        System.out.println("\nAdd weapon");
        d.weapon = new Staff();
        System.out.println("\nWeapon name : "+d.weapon.name());
        System.out.println("Weapon attack : "+d.weapon.attack());
        System.out.println("Attack with weapon : "+d.attack()+"\n");
        d.setDruidState(DruidState.cat);
        d.info();
        d.setDruidState(DruidState.owl);
        d.info();
        d.setDruidState(DruidState.bear);
        d.info();

        System.out.println("\n**************New Player***********************\n");
        Warrior r = new Knight();
        System.out.println(r.weapon.name() + " attack "+r.attack());
        System.out.println("\nAdd weapon");
        r.weapon = new Dagger();
        System.out.println("\nWeapon name : "+r.weapon.name());
        System.out.println("Weapon attack : "+r.weapon.attack());
        System.out.println("Attack with weapon : "+r.attack()+"\n");
        r.info();

        System.out.println("\n**************New Player***********************\n");
       Warrior x = new Mage();
        System.out.println(x.weapon.name() + " attack "+x.attack());
        System.out.println("\nAdd weapon");
        x.weapon = new Katana();
        System.out.println("\nWeapon name : "+x.weapon.name());
        System.out.println("Weapon attack : "+x.weapon.attack());
        System.out.println("Attack with weapon : "+x.attack()+"\n");
        x.info();

    }
}
