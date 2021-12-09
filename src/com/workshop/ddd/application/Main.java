package com.workshop.ddd.application;

import com.workshop.ddd.domain.*;
import com.workshop.ddd.domain.domain_service.CompetitorBasePricer;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        ShoppingCart shoppingCart = new ShoppingCart();
//
//        Product product1 = new Product("IPad Pro", new Price(10000));
//        Item item1 = new Item(product1, 1);
//        shoppingCart.addProduct(item1);
//
//        Product product2 = new Product("Hero ink Pen", new Price(100));
//        shoppingCart.addProduct(new Item(product2, 1));
//
//        Product product3 = new Product("GM Cricket bat", new Price(500));
//        shoppingCart.addProduct(new Item(product3, 2));
//
//        shoppingCart.removeProduct(item1);
//        shoppingCart.addProduct(item1);
//        shoppingCart.removeProduct(item1);
//
//        System.out.println(shoppingCart);
//        System.out.println(shoppingCart.getRemovedProducts());

        //-------------------------
        ShoppingCart cart1 = new ShoppingCart();

        ShoppingCart cart2 = new ShoppingCart();

        final HashMap<String, Double> competitorProducts = new HashMap<>();
        competitorProducts.put("Ipad", 10000.0);
        competitorProducts.put("GM Cricket bat", 500.0);

        final CompetitorBasePricer competitorBasePricer = new CompetitorBasePricer(competitorProducts);

        Product prod1 = new Product("Ipad", new Price(competitorBasePricer.getDiscountedPrice("Ipad")));
        Product prod2 = new Product("Ipad", new Price(competitorBasePricer.getDiscountedPrice("Ipad")));

        cart1.addProduct(new Item(prod1, 1));
        cart2.addProduct(new Item(prod2, 1));

        System.out.println(cart1);
        System.out.println(cart2);
        System.out.println(cart1.equals(cart2));
    }
}
