package com.springboot.springbootpractice.repositories;

import com.springboot.springbootpractice.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repository to handle Authority related queries
 * @author Marko
 * @Date 13/03/2023
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByName(String name);
}
