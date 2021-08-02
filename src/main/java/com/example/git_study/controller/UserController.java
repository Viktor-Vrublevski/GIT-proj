package com.example.git_study.controller;


import com.example.git_study.entity.User;
import com.example.git_study.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
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
