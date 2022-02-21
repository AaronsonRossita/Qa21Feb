package com.company.customer;

public class Customer {

    private int amount;
    private String name;
    private boolean payment;
    private Address address;

    public Customer(int amount, String name, boolean payment, Address address) {
        this.amount = amount;
        this.name = name;
        this.payment = payment;
        this.address = address;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                ", payment=" + payment +
                '}';
    }
}
