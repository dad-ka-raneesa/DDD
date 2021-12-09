package com.workshop.ddd.domain;

import java.util.List;

public class Customer {
    private Address address;
    private final List<BankAccount> bankAccounts;

    public Customer(Address address, List<BankAccount> bankAccounts){
        this.address = address;
        this.bankAccounts = bankAccounts;
    }

    public void updateAddress(Address newAddress) {
        this.address = newAddress;
        for(BankAccount bankAccount: bankAccounts){
            bankAccount.updateAddress(newAddress);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address=" + address +
                ", bankAccounts=" + bankAccounts +
                '}';
    }
}
