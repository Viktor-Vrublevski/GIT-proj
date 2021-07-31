package com.example.git_study.repository;

import com.example.git_study.entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static Map<Long, User> USER_REPOSITORY = new HashMap<>();

    public User getUserById(long id) {
        return USER_REPOSITORY.get(id);
    }

    public boolean addUser(User user) {
       User user1 = USER_REPOSITORY.put(user.getId(), user);
       if (USER_REPOSITORY.containsKey(user.getId())) {
           return false;
       } else {
           return true;
       }
    }
    public void delete(long id) {
        USER_REPOSITORY.remove(id);
    }

    public void update(User user) {
        USER_REPOSITORY.put(user.getId(), user);
    }
}
