package com.company.customer;

public class PrivateCustomer extends Customer {

    private String surname;
    private boolean service;


    public PrivateCustomer(int amount, String name, boolean payment, Address address, String surname, boolean service) {
        super(amount, name, payment, address);
        this.surname = surname;
        this.service = service;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }
}
