package com.workshop.ddd.domain;

import java.util.Currency;

public class Price {
    private int price;
    public static final Currency currency = Currency.getInstance("INR");;

    public Price(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price + '\'' +
                ", currency=" + currency +
                '}';
    }
}
