package com.jbqneto.construo.minimarket.domain.port;

import com.jbqneto.construo.minimarket.application.infrastructure.dao.Dao;
import com.jbqneto.construo.minimarket.domain.model.product.Product;

public interface ProductDao<T extends Product> extends Dao<T> {

}
