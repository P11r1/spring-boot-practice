package com.springboot.springbootpractice.controllers;

import com.springboot.springbootpractice.exceptions.SchoolNotFoundException;
import com.springboot.springbootpractice.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Marko
 * @Date 01/03/2023
 */
@Controller
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;
    @GetMapping
    public String showSchoolListPage(Model model) {
        model.addAttribute("schools", schoolService.findAllSchools());
        return "school/list-school";
    }
    @GetMapping("/{id}")
    public String showSchoolViewPage(@PathVariable Long id, Model model) {
        try {
            model.addAttribute("school", schoolService.findSchoolById(id));
            return "school/view-school";
        } catch (SchoolNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
