package com.crud.proyecto_integrador.service;

import com.crud.proyecto_integrador.model.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(String userId);
    User updateUser(String userId, User user);
    void deleteUser(String userId);
    List<User> getAllUsers();
}
