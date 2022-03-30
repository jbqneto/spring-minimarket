package com.jbqneto.construo.minimarket.domain.model.user;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @EqualsAndHashCode.Include
    private final int id;

    private final String name;

    @EqualsAndHashCode.Include
    private final String email;

    private final ERole role;
    private String password;

    public User(int id, String name, String email, ERole role, String password) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.id = id;
        this.password = password;
    }

    public User(int id, String name, String email, ERole role) {
        this(id, name, email, role, null);
    }

    public User(String name, String email, ERole role) {
        this(0, name, email, role, null);
    }

}
