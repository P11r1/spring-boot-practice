package com.springboot.springbootpractice.repositories;

import com.springboot.springbootpractice.models.Course;
import com.springboot.springbootpractice.models.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository to handle all Course related DB operations
 *
 * @author Marko
 * @Date 22/02/2023
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    Optional<Course> findByName(String name);

    List<Course> findAllBySchool(School school);
}
