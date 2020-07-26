package com.teo.services;

import com.teo.data.UserRepository;
import com.teo.data.models.Admin;
import com.teo.data.models.User;
import com.teo.io.IODevice;

public class AuthenticationService {

    private UserRepository userRepository;
    private User loggedUser;

    public AuthenticationService() {
        this.userRepository = UserRepository.getInstance();
    }

    /**
     * Checks if user with such username exists and compares its password with the provided password.
     * Logged user is remembered in the loggedUser field.
     * @param username provided username
     * @param password password for the provided username
     * @return true if user exists and password matches and false otherwise
     */
    public boolean requestAuthentication(String username, String password) {
        if(isValid(username) && isValid(password)) {
            User user = userRepository.getUserByUsername(username);
            if(user != null && user.getPassword().equals(password)) {
                loggedUser = user;
                return true;
            }
        }

        return false;
    }

    public boolean isUserLogged() {
        return loggedUser != null;
    }

    public void logout() {
        this.loggedUser = null;
    }

    public boolean isUserAdmin() {
        return isUserLogged() && loggedUser instanceof Admin;
    }

    private boolean isValid(String text) {
        return text != null && !text.isEmpty();
    }

    public User getLoggedUser() {
        return loggedUser;
    }
}
