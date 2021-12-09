package com.workshop.ddd.domain;

public class Price {
    private Double price;

    public Price(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price +
                '}';
    }
}
