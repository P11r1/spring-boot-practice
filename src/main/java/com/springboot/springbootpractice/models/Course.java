package com.springboot.springbootpractice.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * Course model
 * @author Marko
 * @Date 22/02/2023
 */
@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    private int durationInDays;
    @OneToOne(cascade = CascadeType.MERGE) // One to one // (ALL) - when one to many
    private School school;
}
