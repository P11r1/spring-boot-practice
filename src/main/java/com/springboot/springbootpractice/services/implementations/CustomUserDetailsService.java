package com.springboot.springbootpractice.services.implementations;

import com.springboot.springbootpractice.exceptions.UserNotFoundException;
import com.springboot.springbootpractice.models.User;
import com.springboot.springbootpractice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Customized implementation of UserDetailsService
 *
 * @author Marko
 * @Date 13/03/2023
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            User user = userService.findUserByUsername(username);
            return new CustomUserDetails(user);
        } catch (UserNotFoundException e) {
            throw new UsernameNotFoundException(e.getLocalizedMessage());
        }
    }
}
