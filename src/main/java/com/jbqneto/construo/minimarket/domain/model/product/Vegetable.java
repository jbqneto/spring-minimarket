package com.jbqneto.construo.minimarket.domain.model.product;

import java.math.BigDecimal;

public class Vegetable extends WeighProduct {

    public Vegetable(String description, BigDecimal price, double weight) {
        super(description, price, weight);
    }
}
