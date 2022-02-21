package com.company;

public class Animal {

    private int legs;
    private boolean female;
    private String name;

    public Animal(int legs, boolean female, String name) {
        if (legs <= 0){
            this.legs = 1;
        }else{
            this.legs = legs;
        }
        this.female = female;
        this.name = name;
    }

    public int getLegs() {
        if (legs <= 0){
            return 1;
        }
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println(this.name + " makes noise");
    }

    public void run(){
        System.out.println("The animal named " + this.name + " is running");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs = " + legs +
                ", female = " + female +
                ", name = '" + name + '\'' +
                '}';
    }
}
