package com.springboot.springbootpractice.services.implementations;

import com.springboot.springbootpractice.exceptions.SchoolNotFoundException;
import com.springboot.springbootpractice.models.School;
import com.springboot.springbootpractice.repositories.SchoolRepository;
import com.springboot.springbootpractice.services.SchoolService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of SchoolService
 * @author Marko
 * @Date 27/02/2023
 */
@Service
@Transactional
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;
    @Override
    public void createSchool(School school) {
        school.setActive(true);
        schoolRepository.save(school);
    }

    @Override
    public School findSchoolById(Long id) throws SchoolNotFoundException {
        Optional<School> schoolOptional = schoolRepository.findById(id);

        if (schoolOptional.isEmpty()) {
            throw new SchoolNotFoundException(id);
        }
        return schoolOptional.get();
    }

    @Override
    public School findSchoolByName(String name) throws SchoolNotFoundException {
        Optional<School> schoolOptional = schoolRepository.findByName(name);

        if (schoolOptional.isEmpty()) {
            throw new SchoolNotFoundException(name);
        }
        return schoolOptional.get();
    }

    @Override
    public List<School> findAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public void updateSchool(School school) throws SchoolNotFoundException {
        if(findSchoolById(school.getId()) != null) {
            schoolRepository.saveAndFlush(school);
        }
    }

    @Override
    public void deleteSchoolByID(Long id) throws SchoolNotFoundException {
        School school = findSchoolById(id);
      //  schoolRepository.delete(school); // To delete the record completely
        school.setActive(false);
        schoolRepository.saveAndFlush(school);
    }

    @Override
    public void restoreSchoolByID(Long id) throws SchoolNotFoundException {
        School school = findSchoolById(id);
        school.setActive(true);
        schoolRepository.saveAndFlush(school);
    }
}
