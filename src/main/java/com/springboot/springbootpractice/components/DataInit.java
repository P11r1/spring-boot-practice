package com.springboot.springbootpractice.components;

import com.springboot.springbootpractice.exceptions.SchoolNotFoundException;
import com.springboot.springbootpractice.models.School;
import com.springboot.springbootpractice.services.SchoolService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Component to initialize data on application startup
 *
 * @author Marko
 * @Date 27/02/2023
 */

@Component
public class DataInit {
    @Autowired
    private SchoolService schoolService;
    @PostConstruct
    public void init() {
        initSchool();
    }

    // PRIVATE METHODS //
    //always public methods top, private bottom
    private void initSchool() {
        System.out.println("Starting School initialization...");
        School school = new School();

        school.setName("Tartu University");
        school.setAddress("Ulikooli 18, Tartu.");
        school.setPhone("+37256653354");

        try {
            School searchSchool = schoolService.findSchoolByName(school.getName());
            System.out.println("Cannot pre-initialize school: " + school.getName());
        } catch (SchoolNotFoundException e) {
            schoolService.createSchool(school);
        }
    }
}
