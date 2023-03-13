package com.springboot.springbootpractice.controllers;

import com.springboot.springbootpractice.exceptions.UserNotFoundException;
import com.springboot.springbootpractice.models.User;
import com.springboot.springbootpractice.services.AuthorityService;
import com.springboot.springbootpractice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Controller to handle all user related operations
 *
 * @author Marko
 * @Date 13/03/2023
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private AuthorityService authorityService;

    @GetMapping
    public String showAllUserPage(Model model) {
        model.addAttribute("users", userService.findAllUsers());
        return "user/list-user";
    }

    @GetMapping("/signup")
    public String showSignupPage(Model model, @ModelAttribute("user")User user, @ModelAttribute("message") String message,
                                 @ModelAttribute("messageType")String messageType) {
        model.addAttribute("authorities", authorityService.findAllAuthorities());
        return "user/create-user";
    }

    @PostMapping("/signup")
    public String createUser(User user, RedirectAttributes redirectAttributes) {
        try {
            userService.findUserByUsername(user.getUsername());
            redirectAttributes.addFlashAttribute("message", String.format("User(%s) already exists!", user.getUsername()));
            redirectAttributes.addFlashAttribute("messageType", "error");
            return "redirect:/school/signup";
        } catch (UserNotFoundException e) {
            redirectAttributes.addFlashAttribute("message", "Signup successful!");
            redirectAttributes.addFlashAttribute("messageType", "error");
            return "redirect:/";
        }
    }
}
