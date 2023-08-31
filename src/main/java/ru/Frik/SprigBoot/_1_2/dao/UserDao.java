package ru.Frik.SprigBoot._1_2.dao;


import ru.Frik.SprigBoot._1_2.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUserById(int id);

    void saveNewUser(User user);

    void update(User user);

    void delete(int id);
}
