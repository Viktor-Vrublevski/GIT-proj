package com.example.git_study.service;

import com.example.git_study.entity.User;
import com.example.git_study.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User getUserById(int id) {
        return repository.getUserById(id);
    }
    public boolean create(User user) {
        return repository.addUser(user);
    }
    public void delete(long id) {
        repository.delete(id);
    }
    public void update(User user) {
        repository.update(user);
    }
}
