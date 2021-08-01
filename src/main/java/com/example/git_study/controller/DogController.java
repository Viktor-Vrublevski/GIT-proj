package com.example.git_study.controller;


import com.example.git_study.entity.Dog;
import com.example.git_study.service.DogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/Dog")
public class DogController {

    private DogService service;

    public DogController(DogService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<String> addNewDog(@RequestParam Dog dog) {
        if(service.create(dog)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}
