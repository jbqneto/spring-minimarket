package com.jbqneto.construo.minimarket.application.infrastructure.dao.impl;

import com.jbqneto.construo.minimarket.application.infrastructure.dao.mapper.UserRowMapper;
import com.jbqneto.construo.minimarket.domain.model.product.Fruit;
import com.jbqneto.construo.minimarket.domain.port.ProductDao;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class FruitJDBDao implements ProductDao<Fruit> {

    private final JdbcTemplate template;
    private final UserRowMapper userMapper;

    @Override
    public List<Fruit> list() {
        return null;
    }

    @Override
    public Fruit create(Fruit fruit) {
        return null;
    }

    @Override
    public void update(Fruit fruit) {

    }

    @Override
    public void delete(Fruit fruit) {

    }

    @Override
    public Optional<Fruit> get(int id) {
        return Optional.empty();
    }
}
