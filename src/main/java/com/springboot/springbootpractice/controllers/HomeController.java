package com.springboot.springbootpractice.controllers;

import com.springboot.springbootpractice.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for the Home page
 *
 * @author Marko
 * @Date 02/03/2023
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String showHomepage() {
        return "home";
    }
}
