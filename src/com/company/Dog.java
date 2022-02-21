package com.company;

public class Dog  extends Animal{

    boolean loyalty;

    public Dog(int legs, boolean female, String name, boolean loyalty) {
        super(legs, female, name);
        this.loyalty = loyalty;
    }

    @Override
    public void run() {
        System.out.println("This dog named " + getName() + " is running");
    }
}
