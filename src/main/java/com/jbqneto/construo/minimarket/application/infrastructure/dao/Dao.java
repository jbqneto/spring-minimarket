package com.jbqneto.construo.minimarket.application.infrastructure.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    List<T> list();
    T create(T t);
    void update(T t);
    void delete(T t);
    Optional<T> get(int id);
}
