package com.springboot.springbootpractice.repositories;

import com.springboot.springbootpractice.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository to handle all Student related DB operations
 *
 * @author Marko
 * @Date 22/02/2023
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByName(String name);
}
