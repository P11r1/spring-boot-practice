package com.springboot.springbootpractice.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**
 * Teacher model
 * @author Marko
 * @Date 22/02/2023
 */
@Entity
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Course> specializedCourses;

}
