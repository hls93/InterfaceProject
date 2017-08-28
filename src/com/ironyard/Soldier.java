package com.ironyard;



public abstract class Soldier implements HandToHand, Weapon {

    public String name;
    public String rank;
    public int serialNumber;

    public Soldier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    public void sleep(){
        System.out.println("snore");
    }

    public void eat() {
        System.out.println("chew");
    }

    public void walk() {
        System.out.println("trudge");
    }

    public void punch() {
        System.out.println("Hiya!");
    }
    public void kick() {
        System.out.println("Smack!");
    }

    public void gun(){
        System.out.println("Shoot");
    }
    public void knife() {
        System.out.println("Slash");
    }

    public String Bomb() {
        System.out.println("KABOOM!!");
       return "KABOOM!!!!";
    }

    @Override
    public void hammer(){
        System.out.println("Smash!");
    }

    public abstract void speak();
}
