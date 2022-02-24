package com.company.person;

public class Person {

    private Id myId;
    private Car myCar;

    public Person(Car myCar) {
        this.myCar = myCar;
    }

    public Person(Id myId, Car myCar) {
        this.myId = myId;
        this.myCar = myCar;
    }

    public Id getMyId() {
        return myId;
    }

    public void setMyId(Id myId) {
        this.myId = myId;
    }

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }

    @Override
    public String toString() {
        return "Person{" +
                "myId=" + myId +
                '}';
    }
}
