package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal(4,false,"Tom");
        Animal animal2 = new Animal(2,false,"Lei");

        Cat cat1 = new Cat(4,false,"Hatool",8);
        Dog dog1 = new Dog(4,true,"Lexxie",true);

//        System.out.println(cat1.toString());
//        System.out.println(dog1);
//
//        cat1.run();
        dog1.run();

//        animal1.makeNoise();
//        animal1.run();

//        System.out.println(animal2.getLegs());
//        System.out.println(animal1.toString());
//        System.out.println(animal1);
    }
}
