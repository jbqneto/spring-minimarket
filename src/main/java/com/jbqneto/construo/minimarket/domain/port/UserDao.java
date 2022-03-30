package com.jbqneto.construo.minimarket.domain.port;

import com.jbqneto.construo.minimarket.application.infrastructure.dao.Dao;
import com.jbqneto.construo.minimarket.domain.model.user.User;

public interface UserDao extends Dao<User> {
    void changePassword(User user, String password);
}
