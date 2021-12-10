package com.workshop.ddd.domain;

import java.util.List;

public class Order {
    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

    public Double getTotalCost() {
        double totalPrice = 0.0;
        for(Product product: this.products){
            totalPrice += (product.getProductPrice().getPrice() + (product.getWeight() * 0.01));
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                '}';
    }
}
