package com.workshop.ddd.domain.domain_service;

import java.util.HashMap;

public class CompetitorBasePricer {
    private final int discount = 10;
    private HashMap<String, Double> competitorProducts;

    public CompetitorBasePricer(HashMap<String, Double> competitorProducts) {
        this.competitorProducts = competitorProducts;
    }

    public Double getDiscountedPrice(String productName) {
        Double price = competitorProducts.get(productName);
        if(price == null) return null;
        return price - (price * (this.discount / 100.0));
    }
}
