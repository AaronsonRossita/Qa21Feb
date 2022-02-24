package com.company;

import com.company.customer.Address;
import com.company.customer.BusinessCustomer;
import com.company.customer.Customer;
import com.company.customer.PrivateCustomer;
import com.company.person.Car;
import com.company.person.Id;
import com.company.person.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Animal animal1 = new Animal(4,false,"Tom");
//        Animal animal2 = new Animal(2,false,"Lei");
//
//        Cat cat1 = new Cat(4,false,"Hatool",8);
//        Dog dog1 = new Dog(4,true,"Lexxie",true);
//
//        System.out.println(cat1.toString());
//        System.out.println(dog1);
//
//        cat1.run();
//        dog1.run();
//
//        animal1.makeNoise();
//        animal1.run();
//
//        System.out.println(animal2.getLegs());
//        System.out.println(animal1.toString());
//        System.out.println(animal1);
        Address address = new Address("hagalil",23,4,"Lod");
        Customer customer1 = new Customer(10,"Haim",true,address);

        PrivateCustomer pCustomer1 =
                new PrivateCustomer(2,"Rivka",true,address,"Cohen",false);
        BusinessCustomer bCustomer1 =
                new BusinessCustomer(4,"Mashu",true,
                        new Address("Dekel",3,8,"Kfar Saba"),15);

//        customer1.printHello();
//        pCustomer1.printHello();
//        bCustomer1.printHello();
//
//        System.out.println(customer1);
//        System.out.println(pCustomer1.toString());
//        System.out.println(bCustomer1);
//        System.out.println(customer1.getAddress().getStreet());
//        System.out.println(pCustomer1.getAddress().getStreet());
//        System.out.println(bCustomer1.getAddress().getStreet());

//        Car car1 = new Car(1.2,4,true);
//        Person person1 = new Person(car1);
//
//        System.out.println(person1.getMyCar().getEngine());
//        System.out.println(car1.getEngine());
//
//        Person person2 = new Person(new Car(1.6,6,false));
//        System.out.println(person2.getMyCar().getSeats());
        int[] arr = {1,2,3};

//        printSqrA(8);
//        printSqrA(8.2);
//        printSqrA(arr);


//        ArrayList list = new ArrayList();
//        list.add("String");
//        list.add(true);
//        list.add(2.8);
//        System.out.println(list.toString());
//        list.add(1,false);
//        System.out.println(list);
//        list.set(1,4);
//        System.out.println(list);

        int x = 5;
        Integer y = 7;

        double d = 1.2;
        Double d1 = 1.3;

        boolean b = true;
        Boolean b1 = false;

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(x);
        list2.add(y);
        System.out.println(list2.toString());
    }

//      overload
    static void printSqrA(int a){
        System.out.println(a * a);
    }

    static void printSqrA(double a){
        System.out.println(a * a);
    }

    static void printSqrA(int[] a){
        int temp = 1;
        for (int i = 0; i < a.length; i++) {
            temp *= a[i];
        }
        System.out.println(temp);
    }
}
