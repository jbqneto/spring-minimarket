package com.jbqneto.construo.minimarket.application.presentation.controller;

import com.jbqneto.construo.minimarket.application.presentation.representation.user.GetUserDTO;
import com.jbqneto.construo.minimarket.application.presentation.representation.user.PostUserDTO;
import com.jbqneto.construo.minimarket.domain.model.user.User;
import com.jbqneto.construo.minimarket.domain.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Api(value = "users", tags = "users")
@RequestMapping("/v1/users")
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


    @GetMapping("/{id}")
    public ResponseEntity<GetUserDTO> getById(@PathVariable int id) {
        User user = this.userService.findById(id);

        return ResponseEntity.ok(new GetUserDTO(user));
    }

    @PostMapping("")
    public ResponseEntity<GetUserDTO> addUser(@RequestBody PostUserDTO userDTO) {
        var user = new User(
                userDTO.getName(),
                userDTO.getEmail(),
                userDTO.getRole()
        );

        user.setPassword(userDTO.getPassword());

        user = this.userService.create(user);

        return ResponseEntity.ok(new GetUserDTO(user));
    }

}
