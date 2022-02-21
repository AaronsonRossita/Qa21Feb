package com.company.customer;

public class BusinessCustomer extends Customer{

    private int discount;

    public BusinessCustomer(int amount, String name, boolean payment, Address address, int discount) {
        super(amount, name, payment, address);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "BusinessCustomer{" +
                "amount = " + this.getAmount() +
                ", name = " + this.getName() +
                ", payment = " + this.isPayment() +
                ", discount=" + discount +
                "%}";
    }
}
