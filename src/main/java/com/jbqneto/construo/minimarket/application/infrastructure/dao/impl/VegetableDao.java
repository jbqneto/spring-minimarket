package com.jbqneto.construo.minimarket.application.infrastructure.dao.impl;

import com.jbqneto.construo.minimarket.application.infrastructure.dao.mapper.UserRowMapper;
import com.jbqneto.construo.minimarket.domain.model.product.Vegetable;
import com.jbqneto.construo.minimarket.domain.port.ProductDao;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class VegetableDao implements ProductDao<Vegetable> {

    private final JdbcTemplate template;
    private final UserRowMapper userMapper;

    @Override
    public List<Vegetable> list() {
        return null;
    }

    @Override
    public Vegetable create(Vegetable vegetable) {
        return null;
    }

    @Override
    public void update(Vegetable vegetable) {

    }

    @Override
    public void delete(Vegetable vegetable) {

    }

    @Override
    public Optional<Vegetable> get(int id) {
        return Optional.empty();
    }
}
