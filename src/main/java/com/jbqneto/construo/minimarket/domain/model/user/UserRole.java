package com.jbqneto.construo.minimarket.domain.model.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public class UserRole implements GrantedAuthority {
    private final ERole role;

    @Override
    public String getAuthority() {
        return role.name();
    }
}
