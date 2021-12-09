package com.workshop.ddd.domain;

public class BankAccount {

    private Address address;

    public  BankAccount(Address address){
        this.address = address;
    }

    public void updateAddress(Address newAddress) {
        this.address = newAddress;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "address=" + address +
                '}';
    }
}
