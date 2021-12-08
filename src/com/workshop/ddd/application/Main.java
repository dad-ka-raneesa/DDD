package com.workshop.ddd.application;

import com.workshop.ddd.domain.*;

public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product1 = new Product("IPad Pro", new Price(10000));
        Item item1 = new Item(product1, 1);
        shoppingCart.addProduct(item1);

        Product product2 = new Product("Hero ink Pen", new Price(100));
        shoppingCart.addProduct(new Item(product2, 1));

        Product product3 = new Product("GM Cricket bat", new Price(500));
        shoppingCart.addProduct(new Item(product3, 2));

        shoppingCart.removeProduct(item1);
        shoppingCart.addProduct(item1);
        shoppingCart.removeProduct(item1);

        System.out.println(shoppingCart);
        System.out.println(shoppingCart.getRemovedProducts());

        //-------------------------
        ShoppingCart cart1 = new ShoppingCart();

        ShoppingCart cart2 = new ShoppingCart();

        Product prod1 = new Product("Ipad", new Price(10000));

        Product prod2 = new Product("Ipad", new Price(5000));

        cart1.addProduct(new Item(prod1, 1));
        cart2.addProduct(new Item(prod2, 1));

        System.out.println(cart1.equals(cart2));
    }
}
