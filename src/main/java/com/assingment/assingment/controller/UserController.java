package com.assingment.assingment.controller;

import com.assingment.assingment.entity.UserEntity;
import com.assingment.assingment.exception.IdNotExistException;
import com.assingment.assingment.model.User;
import com.assingment.assingment.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController (UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) throws IdNotExistException {
        if(userService.getUserById(id) != null){
            return ResponseEntity.ok(userService.getUserById(id));
        }
        throw new IdNotExistException("Id " + id + " does not exist in the database");
    }
}
