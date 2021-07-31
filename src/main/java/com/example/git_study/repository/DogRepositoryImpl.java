package com.example.git_study.repository;

import com.example.git_study.entity.Dog;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DogRepositoryImpl implements DogRepository{

    private static Map<Long, Dog> DOG_STORE = new HashMap<>();

    @Override
    public Dog getDogById(long id) {
        return DOG_STORE.get(id);
    }

    @Override
    public boolean addDog(Dog dog) {
        if (DOG_STORE.containsKey(dog.getId())) {
            return false;
        } else {
            DOG_STORE.put(dog.getId(), dog);
            return true;
        }
    }

    @Override
    public void delete(long id) {
        DOG_STORE.remove(id);
    }

    @Override
    public void update(Dog dog) {
        DOG_STORE.put(dog.getId(), dog);
    }
}
