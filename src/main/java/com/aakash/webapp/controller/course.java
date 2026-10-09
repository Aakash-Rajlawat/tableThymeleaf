package com.aakash.webapp.controller;

import com.aakash.webapp.Dao.courseDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
public class course {

    @GetMapping("/course")
    public String setCourse(Model model) {



        //setting data to binding object
        courseDao c1 = new courseDao();
        c1.setID(1);
        c1.setCourseName("Java");
        c1.setCoursePrice(29.99);

        courseDao c2 = new courseDao();
        c2.setID(2);
        c2.setCourseName("Python");
        c2.setCoursePrice(39.99);

        courseDao c3 = new courseDao();
        c3.setID(3);
        c3.setCourseName("C++");
        c3.setCoursePrice(49.99);
        //adding data to model object to sent to UI
        List<courseDao>  courseList = List.of(c1, c2, c3);

        model.addAttribute("course", courseList);

        return "course";
    }
}
