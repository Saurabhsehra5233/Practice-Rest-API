package com.springrest.springrest.controller;


import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.services.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    public CourseService CourseService;

    /*@GetMapping("/home")
    public String home(){
                                    this is for test
        return "this is my home page";
    }*/



    //get the courses

    @GetMapping("/courses")
    public List<Course> getCourses()
     {
        return this.CourseService.getCourses();
    }


    @GetMapping("/courses/{courseId}")
 public Course getCourse(@PathVariable String courseId)
     {
        return this.CourseService.getCourse(Long.parseLong(courseId));
     }





 @PostMapping("/course")
    public Course addCourse(@RequestBody Course course)
    {
        return this.CourseService.addCourse(course);
    }

}
