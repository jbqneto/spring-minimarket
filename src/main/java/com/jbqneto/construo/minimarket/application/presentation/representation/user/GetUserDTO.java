package com.jbqneto.construo.minimarket.application.presentation.representation.user;

import com.jbqneto.construo.minimarket.domain.model.user.User;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GetUserDTO {
    @EqualsAndHashCode.Include
    private long id;
    private String name;
    private String email;
    private String role;

    public GetUserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.role = user.getRole().name();
    }

}
