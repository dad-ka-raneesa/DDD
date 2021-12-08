package com.workshop.ddd.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ShoppingCart {

    private final List<Item> products;
    private final HashSet<String> removedProducts;

    public ShoppingCart(){
        this.products  = new ArrayList<>();
        this.removedProducts = new HashSet<>();
    }

    public void addProduct(Item item){
        products.add(item);
    }

    public void removeProduct(Item item){
        products.remove(item);
        this.removedProducts.add(item.getProduct().getName());
    }

    public HashSet<String> getRemovedProducts() {
        return removedProducts;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
