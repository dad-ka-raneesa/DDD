package com.workshop.ddd.domain;

public class Product {

    private final String name;
    private final Price price;
    private final Double weight;

    public Product(String name, Price price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Price getProductPrice() {
        return price;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
