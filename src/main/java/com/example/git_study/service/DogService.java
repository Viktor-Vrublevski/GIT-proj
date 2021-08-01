package com.example.git_study.service;

import com.example.git_study.entity.Dog;
import com.example.git_study.repository.DogRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class DogService {

    private DogRepository repository;

    public DogService(DogRepository repository) {
        this.repository = repository;
    }

    public Dog getDog(long id) {
        return repository.getDogById(id);
    }
    public boolean create(Dog dog) {
        return repository.addDog(dog);
    }
    public void delete(long id) {
        repository.delete(id);
    }
    public void update(Dog dog) {
        repository.update(dog);
    }
    public Collection<Dog> getAllDogs() {
        return repository.getAllDogs();
    }
}
