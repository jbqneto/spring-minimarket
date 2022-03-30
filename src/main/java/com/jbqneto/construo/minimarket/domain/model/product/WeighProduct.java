package com.jbqneto.construo.minimarket.domain.model.product;

import java.math.BigDecimal;

public abstract class WeighProduct extends Product {
    private final double weight;

    public WeighProduct(String description, BigDecimal price, double weight) {
        super(description, price);
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return this.price.multiply(BigDecimal.valueOf(weight));
    }
}
