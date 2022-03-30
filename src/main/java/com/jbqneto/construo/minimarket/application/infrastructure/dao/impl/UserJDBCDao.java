package com.jbqneto.construo.minimarket.application.infrastructure.dao.impl;

import com.jbqneto.construo.minimarket.application.infrastructure.dao.Dao;
import com.jbqneto.construo.minimarket.application.infrastructure.dao.mapper.UserRowMapper;
import com.jbqneto.construo.minimarket.domain.model.user.User;
import com.jbqneto.construo.minimarket.domain.port.UserDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Log4j2
@Repository
public class UserJDBCDao implements UserDao {

    private final JdbcTemplate template;
    private final UserRowMapper userMapper;

    @Override
    public List<User> list() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT U.user_id, U.name, U.email, U.role ");
        sql.append(" FROM users");

        return template.query(sql.toString(), userMapper::mapRow);
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public Optional<User> get(int id) {
        return Optional.empty();
    }
}
