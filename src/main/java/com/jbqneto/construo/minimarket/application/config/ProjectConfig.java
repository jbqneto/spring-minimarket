package com.jbqneto.construo.minimarket.application.config;

import com.jbqneto.construo.minimarket.domain.model.user.ERole;
import com.jbqneto.construo.minimarket.domain.model.user.User;
import com.jbqneto.construo.minimarket.domain.service.UserService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ProjectConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }

    @Bean
    public ApplicationRunner initializer(UserService userService) {
        return args -> {
            var users = userService.findAllUsers();

            if (users.size() == 0) {
                userService.create(
                        new User(0,"José", "jbqneto@gmail.com", ERole.ADMIN, "construo123")
                );
            }
        };
    }
}
