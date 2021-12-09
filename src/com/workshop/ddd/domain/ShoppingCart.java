package com.workshop.ddd.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ShoppingCart {

    private final String id;
    private final List<Item> products;
    private final List<DomainEvent> removedProducts;

    public ShoppingCart(){
        this.id = UUID.randomUUID().toString();
        this.products  = new ArrayList<>();
        this.removedProducts = new ArrayList<>();
    }

    public void addProduct(Item item){
        products.add(item);
    }

    public void removeProduct(Item item){
        products.remove(item);
        this.removedProducts.add(new DomainEvent(item.getProduct().getName()));
    }

    public List<DomainEvent> getRemovedProducts() {
        return removedProducts;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(id, that.id);
    }
}
