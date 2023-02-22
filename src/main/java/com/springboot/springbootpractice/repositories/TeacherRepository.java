package com.springboot.springbootpractice.repositories;

import com.springboot.springbootpractice.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to handle all Teacher related DB operations
 *
 * @author Marko
 * @Date 22/02/2023
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
