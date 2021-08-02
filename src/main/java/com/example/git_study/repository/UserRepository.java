package com.example.git_study.repository;

import com.example.git_study.entity.User;

import java.util.Collection;

public interface UserRepository {
    User getUserById(long id);
    boolean addUser(User user);
    void delete(long id);
    void update(User user);
    Collection<User> getAllUsers();
}
