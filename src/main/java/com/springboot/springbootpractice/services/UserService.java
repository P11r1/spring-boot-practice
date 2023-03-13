package com.springboot.springbootpractice.services;

import com.springboot.springbootpractice.exceptions.UserNotFoundException;
import com.springboot.springbootpractice.models.User;

import java.util.List;

/**
 * Service to handle User related operations
 *
 * @author Marko
 * @Date 13/03/2023
 */
public interface UserService {
    /**
     * To find all Users
     * @return a list of Users
     */
    List<User> findAllUsers();

    /**
     * To find User by Username
     * @param username username
     * @return User
     */
    User findUserByUsername(String username) throws UserNotFoundException;

    /**
     * To create a new User
     * @param user User
     */
    void createUser(User user);

}
