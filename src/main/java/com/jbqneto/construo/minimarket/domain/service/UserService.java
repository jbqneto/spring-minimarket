package com.jbqneto.construo.minimarket.domain.service;

import com.jbqneto.construo.minimarket.domain.exception.ModelNotFoundException;
import com.jbqneto.construo.minimarket.domain.model.user.User;
import com.jbqneto.construo.minimarket.domain.port.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;

    public List<User> findAllUsers() {
        return this.userDao.list();
    }

    public User create(User user) {
        return this.userDao.create(user);
    }

    public void update(User user) {
        this.findById(user.getId());

        this.userDao.update(user);
    }

    public void changePassword(int id, String oldPassword, String password) {
        var user = this.findById(id);

        this.userDao.changePassword(user, password);
    }

    public User findById(int id) {
        var user = this.userDao.get(id);

        if (user.isEmpty())
            throw new ModelNotFoundException("User not found: " + id);

        return user.get();
    }

    public void delete(int id) {
        this.userDao.delete(this.findById(id));
    }

}
