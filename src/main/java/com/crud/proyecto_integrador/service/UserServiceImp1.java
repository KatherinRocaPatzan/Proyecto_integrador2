package com.crud.proyecto_integrador.service;

import com.crud.proyecto_integrador.model.User;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserServiceImp1 implements UserService {
    private final Map<String, User> userMap = new HashMap<>();

    @Override
    public User createUser(User user) {
        userMap.put(user.getUserId(), user);
        return user;
    }

    @Override
    public User getUserById(String userId) {
        return userMap.get(userId);
    }

    @Override
    public User updateUser(String userId, User updatedUser) {
        userMap.put(userId, updatedUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(String userId) {
        userMap.remove(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }
}
