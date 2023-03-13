package com.springboot.springbootpractice.services;

import com.springboot.springbootpractice.exceptions.AuthorityNotFoundException;
import com.springboot.springbootpractice.models.Authority;

import java.util.List;

/**
 * Service to handle Authority related operations
 *
 * @author Marko
 * @Date 13/03/2023
 */
public interface AuthorityService {
    /**
     * To find all Authorities
     *
     * @return a list of Authorities
     */
    List<Authority> findAllAuthorities();

    /**
     * To find Authoritie by name
     *
     * @param name Authority name
     * @return Authority
     */
    Authority findAuthorityByName(String name) throws AuthorityNotFoundException;

    /**
     * To create a new Authority
     *
     * @param authority Authority
     */
    void createAuthority(Authority authority);

}
