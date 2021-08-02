package com.example.git_study.controller;

import com.example.git_study.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/User")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

}
