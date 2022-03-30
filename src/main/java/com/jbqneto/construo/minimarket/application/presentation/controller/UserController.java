package com.jbqneto.construo.minimarket.application.presentation.controller;

import com.jbqneto.construo.minimarket.application.presentation.representation.user.GetUserDTO;
import com.jbqneto.construo.minimarket.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<List<GetUserDTO>> listUsers() {
        List<GetUserDTO> users = userService.findAllUsers()
                .stream().map(GetUserDTO::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok(users);
    }



}
