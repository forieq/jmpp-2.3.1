package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUserById(int id);

    void updateUser(User user);

    void deleteUserById(int id);

    List<User> getAllUsers();
}
