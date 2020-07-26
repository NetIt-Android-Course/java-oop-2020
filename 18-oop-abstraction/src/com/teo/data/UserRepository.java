package com.teo.data;

import com.teo.data.models.Admin;
import com.teo.data.models.Employee;
import com.teo.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static final UserRepository instance = new UserRepository();

    public static UserRepository getInstance() {
        return instance;
    }

    private final List<User> users;

    private UserRepository() {
        users = new ArrayList<>();
        users.add(new Admin("admin", "admin"));
        users.add(new Employee("pesho", "pesho"));
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void createUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
