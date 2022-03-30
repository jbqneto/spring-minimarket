package com.jbqneto.construo.minimarket.application.infrastructure.dao.mapper;

import com.jbqneto.construo.minimarket.domain.model.user.ERole;
import com.jbqneto.construo.minimarket.domain.model.user.User;
import org.springframework.jdbc.core.RowMapper;

import javax.management.relation.Role;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                rs.getInt("user_id"),
                rs.getString("name"),
                rs.getString("email"),
                ERole.valueOf(rs.getString("role"))
        );
    }

}
