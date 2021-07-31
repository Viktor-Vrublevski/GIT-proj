package com.example.git_study.repository;

import com.example.git_study.entity.Dog;
import com.example.git_study.entity.User;

public interface DogRepository {
    Dog getUserById(long id);
    boolean addUser(Dog dog);
    void delete(long id);
    void update(Dog dog);
}
