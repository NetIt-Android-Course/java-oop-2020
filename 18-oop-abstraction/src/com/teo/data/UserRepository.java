package com.teo.data;

import com.teo.data.models.Admin;
import com.teo.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static UserRepository instance = new UserRepository();

    public static UserRepository getInstance() {
        return instance;
    }

    private List<User> users;

    private UserRepository() {
        users = new ArrayList<>();
        users.add(new Admin("admin", "admin"));
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
