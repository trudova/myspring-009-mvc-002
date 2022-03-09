package com.liv.controllers;

import com.liv.enams.Gender;
import com.liv.models.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String showTable(Model model){
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "smith", 45, Gender.MALE));
        mentorList.add(new Mentor("Paul", "Morgan", 31, Gender.MALE));
        mentorList.add(new Mentor("Liv", "True", 32, Gender.FEMALE));

        model.addAttribute("mentors", mentorList);
        return "mentor/mentor-list";


    }
}
