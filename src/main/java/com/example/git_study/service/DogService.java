package com.example.git_study.service;

import com.example.git_study.entity.Dog;
import com.example.git_study.repository.DogRepository;

public class DogService {
    private DogRepository repository;

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
}
