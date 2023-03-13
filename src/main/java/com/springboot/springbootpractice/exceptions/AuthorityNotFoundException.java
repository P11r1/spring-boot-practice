package com.springboot.springbootpractice.exceptions;

/**
 * Exception for Authority not found
 * @author Marko
 * @Date 13/03/2023
 */
public class AuthorityNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public AuthorityNotFoundException(String name) {
        super(String.format("Authority not found for name: %s", name));
    }
}
