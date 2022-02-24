package com.company.person;

public class Car {

    private double engine;
    private int seats;
    private boolean electric;

    public Car(double engine, int seats, boolean electric) {
        this.engine = engine;
        this.seats = seats;
        this.electric = electric;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
}
