package com.workshop.ddd.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ShoppingCart {

    private final String id;
    private final List<Item> items;
    private final List<DomainEvent> removedProducts;
    private boolean isCheckedOut;

    public ShoppingCart(){
        this.id = UUID.randomUUID().toString();
        this.items = new ArrayList<>();
        this.removedProducts = new ArrayList<>();
        this.isCheckedOut = false;
    }

    public void addProduct(Item item){
        items.add(item);
    }

    public void removeProduct(Item item){
        items.remove(item);
        this.removedProducts.add(new DomainEvent(item.getProduct().getName()));
    }

    public List<DomainEvent> getRemovedProducts() {
        return removedProducts;
    }

    public Order checkout() {
        List<Product> products = new ArrayList<>();
        for(Item item: items){
            for (int i = 0; i < item.getQuantity(); i++) {
                products.add(new Product(item.getProduct().getName(), item.getProduct().getProductPrice(), item.getProduct().getWeight()));
            }
        }
        this.isCheckedOut = true;
        return new Order(products);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + items +
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
