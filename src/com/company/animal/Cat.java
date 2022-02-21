package com.company.animal;

public class Cat extends Animal{

    private int souls;

    public Cat(int legs, boolean female, String name, int souls) {
        super(legs, female, name);
        this.souls = souls;
    }

    @Override
    public void run() {
        System.out.println("This cat named " + getName() + " is running");
    }
}
