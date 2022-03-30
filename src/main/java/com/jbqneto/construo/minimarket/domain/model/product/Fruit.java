package com.jbqneto.construo.minimarket.domain.model.product;

import java.math.BigDecimal;

public class Fruit extends WeighProduct {
    public Fruit(String description, BigDecimal price, double weight) {
        super(description, price, weight);
    }
}
