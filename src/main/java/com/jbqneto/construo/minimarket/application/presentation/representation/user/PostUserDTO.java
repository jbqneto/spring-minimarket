package com.jbqneto.construo.minimarket.application.presentation.representation.user;

import com.jbqneto.construo.minimarket.domain.model.user.ERole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PostUserDTO {
    private String name;
    private String email;
    private String password;
    private ERole role;
}
