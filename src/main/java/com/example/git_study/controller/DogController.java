package com.example.git_study.controller;


import com.example.git_study.entity.Dog;
import com.example.git_study.service.DogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;


@RestController
@RequestMapping("/Dog")
public class DogController {

    private DogService service;

    public DogController(DogService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<String> addNewDog(@RequestBody Dog dog) {
        if(service.create(dog)) {
            return new ResponseEntity<>("Dog have created",HttpStatus.OK);
        } else return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @GetMapping("/all-dogs")
    public Collection<Dog> getAllDogs() {
        return service.getAllDogs();
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateDog(@RequestBody Dog dog) {
        service.update(dog);
        return new ResponseEntity<>("Updating was Successful", HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody Dog dog) {
        service.delete(dog.getId());
        return new ResponseEntity<>("Dog have deleted", HttpStatus.OK);
    }

    @GetMapping("/dog/{id}")
    public ResponseEntity<Dog> getDogById(@PathVariable("id") long id) {
        Dog dog = service.getDog(id);
        return new ResponseEntity<>(dog, HttpStatus.OK);
    }
}
