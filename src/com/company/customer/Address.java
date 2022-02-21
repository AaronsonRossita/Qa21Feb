package com.company.customer;

public class Address {

    private String street;
    private int strNumber;
    private int appNumber;
    private String city;

    public Address(String street, int strNumber, int appNumber, String city) {
        this.street = street;
        this.strNumber = strNumber;
        this.appNumber = appNumber;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStrNumber() {
        return strNumber;
    }

    public void setStrNumber(int strNumber) {
        this.strNumber = strNumber;
    }

    public int getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(int appNumber) {
        this.appNumber = appNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
