package com.springboot.springbootpractice.exceptions;

/**
 * Exception for User not found
 * @author Marko
 * @Date 13/03/2023
 */
public class UserNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;
    public UserNotFoundException(String username) {
        super(String.format("User not found for username: %s!", username));
    }
}
