package com.assingment.assingment.controller;

import com.assingment.assingment.entity.User;
import com.assingment.assingment.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController (UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        if(userService.getUserById(id) != null){
            return userService.getUserById(id);
        }
        return null;
    }
}
