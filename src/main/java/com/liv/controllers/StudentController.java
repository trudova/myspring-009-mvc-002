package com.liv.controllers;

import com.liv.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model) {
        model.addAttribute("name", "liv");
        model.addAttribute("course", "java");
        int randomId = new Random().nextInt(1000);
        model.addAttribute("id", randomId);
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,4,5,6));
        model.addAttribute("nums", nums);
        LocalDate date =  LocalDate.of(1989,05,18);
        model.addAttribute("birthday", date);
        Student student = new Student(1,"Liv","Trudova");
        model.addAttribute("student", student);
        // String name = "liv";
        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2(){

        return "student/register";
    }

}
