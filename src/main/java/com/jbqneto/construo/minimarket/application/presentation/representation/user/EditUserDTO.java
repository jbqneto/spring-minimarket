package com.jbqneto.construo.minimarket.application.presentation.representation.user;

import com.jbqneto.construo.minimarket.domain.model.user.ERole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EditUserDTO {
    private String name;
    private String email;
    private ERole role;
}
