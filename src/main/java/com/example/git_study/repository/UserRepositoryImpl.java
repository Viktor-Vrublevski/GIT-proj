package com.example.git_study.repository;

import com.example.git_study.entity.User;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepositoryImpl implements UserRepository{

    private static Map<Long, User> USER_REPOSITORY = new HashMap<>();

    public User getUserById(long id) {
        return USER_REPOSITORY.get(id);
    }

    public boolean addUser(User user) {
        if (USER_REPOSITORY.containsKey(user.getId())) {
            return false;
        } else {
            USER_REPOSITORY.put(user.getId(), user);
            return true;
        }
    }
    public void delete(long id) {
        USER_REPOSITORY.remove(id);
    }

    public void update(User user) {
        USER_REPOSITORY.put(user.getId(), user);
    }

    @Override
    public Collection<User> getAllUsers() {
        return USER_REPOSITORY.values();
    }


}
