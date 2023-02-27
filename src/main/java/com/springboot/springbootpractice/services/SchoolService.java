package com.springboot.springbootpractice.services;

import com.springboot.springbootpractice.exceptions.SchoolNotFoundException;
import com.springboot.springbootpractice.models.School;

import java.util.List;

/**
 * To handle School related operations
 *
 * @author Marko
 * @Date 27/02/2023
 */
public interface SchoolService {
    /**
     * To create a new school
     * @param school School
     */
    void createSchool(School school);

    /**
     * To find school by ID
     * @param id School ID
     * @return School
     */

    School findSchoolById(Long id) throws SchoolNotFoundException;

    /**
     * To find School by name
     * @param name School name
     * @return School
     */
    School findSchoolByName(String name) throws SchoolNotFoundException;

    /**
     * To find all schools
     * @return list of Schools
     */
    List<School> findAllSchools();

    /**
     * Tu update an existing school
     * @param school School
     */
    void updateSchool(School school) throws SchoolNotFoundException;

    /**
     * To delete a School by ID
     * @param id School ID
     */
    void deleteSchoolByID(Long id) throws SchoolNotFoundException;

    /**
     * To restore a School by ID
     * @param id School ID
     */
    void restoreSchoolByID(Long id) throws SchoolNotFoundException;
}
