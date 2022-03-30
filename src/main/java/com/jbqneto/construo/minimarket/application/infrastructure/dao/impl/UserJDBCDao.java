package com.jbqneto.construo.minimarket.application.infrastructure.dao.impl;

import com.jbqneto.construo.minimarket.application.infrastructure.dao.mapper.UserRowMapper;
import com.jbqneto.construo.minimarket.domain.model.user.User;
import com.jbqneto.construo.minimarket.domain.port.UserDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataAccessException;
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
        sql.append("SELECT U.user_id, U.name, U.email, U.password, U.role");
        sql.append(" FROM user U");

        return template.query(sql.toString(), userMapper::mapRow);
    }

    @Override
    public User create(User user) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO user(name,email,password,role) values(?,?,?,?)");

        int update = template.update(sql.toString(),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getRole().name()
        );

        log.info("User create {}", update);

        return user;
    }

    @Override
    public void update(User user) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE user set name = ?, email = ?, role = ?");
        sql.append(" WHERE user_id = ?");

        int update = template.update(sql.toString(),
                user.getName(),
                user.getEmail(),
                user.getRole().name(),
                user.getId()
        );

        log.info("Update user {}", update);
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public Optional<User> get(int id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT U.user_id, U.name, U.email, U.role");
        sql.append(" FROM user U");
        sql.append(" WHERE user_id = ?");

        User user;

        try {
            user = template.queryForObject(sql.toString(), userMapper);
            return Optional.of(user);
        } catch (DataAccessException e) {
            log.error("User not found", e);
        }

        return Optional.empty();
    }

    @Override
    public void changePassword(User user, String password) {

    }
}
