package com.workshop.ddd.domain;

public class Address {
    private String city;

    public Address(String city){
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
