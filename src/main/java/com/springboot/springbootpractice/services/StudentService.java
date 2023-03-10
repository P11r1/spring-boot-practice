package com.springboot.springbootpractice.services;

import com.springboot.springbootpractice.exceptions.StudentNotFoundException;
import com.springboot.springbootpractice.models.Student;

import java.util.List;

/**
 * To handle all Student related operations
 *
 * @author Marko
 * @Date 01/03/2023
 */
public interface StudentService {
    /**
     * To create a new student
     *
     * @param student Student
     */
    void createStudent(Student student);

    /**
     * To find a student by ID
     *
     * @param id Student ID
     * @return Student
     */
    Student findStudentById(Long id) throws StudentNotFoundException;

    /**
     * To find a student by name
     *
     * @param name Student name
     * @return Student
     */
    Student findStudentByName(String name) throws StudentNotFoundException;

    /**
     * To find all students
     *
     * @return a list of Student
     */
    List<Student> findAllStudents();

    /**
     * To update an existing Student
     *
     * @param student Student
     */
    void updateStudent(Student student) throws StudentNotFoundException;

    /**
     * To delete a Student by ID
     *
     * @param id Student ID
     */
    void deleteStudentById(Long id) throws StudentNotFoundException;

    /**
     * To restore a Student by ID
     *
     * @param id Student ID
     */
    void restoreStudentById(Long id) throws StudentNotFoundException;
}
