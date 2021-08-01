package com.example.git_study.repository;

import com.example.git_study.entity.Dog;

import java.util.Collection;
import java.util.Set;

public interface DogRepository {
    Dog getDogById(long id);
    boolean addDog(Dog dog);
    void delete(long id);
    void update(Dog dog);
    Collection<Dog> getAllDogs();
}
