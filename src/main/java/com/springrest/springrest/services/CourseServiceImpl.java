package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.apache.el.stream.Stream;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public  class CourseServiceImpl implements CourseService {


    List<Course> list;

    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(15, "Java Core ", "this course content basic"));
        list.add(new Course(20,"Spring boot","Content related to spring boot"));
    }

    @Override
    public List<Course> getCourses() {

        return list;
    }

    @Override
    public Course getCourse(long courseId) {
       Course c=null;
       for (Course course:list){
           if (course.getId()==courseId);{
               c=course;
               break;
           }
       }
        return c;
    }



     @Override
    public Course addCourse(Course course) {
      list.add(course);
        return course;
    }


}
