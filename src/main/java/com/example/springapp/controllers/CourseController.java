package com.example.springapp.controllers;

import com.example.springapp.repositories.ClassesRepository;
import com.example.springapp.repositories.CourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

    private CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @RequestMapping("/courses")
    public String getCourses(Model model) {

        model.addAttribute("courses", courseRepository.findAll());

        return "courses";
    }
}
