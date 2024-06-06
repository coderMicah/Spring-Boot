package com.micah.spring_boot_basics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
            new Course(1,"Learn SQL","John Doe"),
            new Course(2,"Learn JAVA","Jane Doe"),
            new Course(3,"Learn Data Structures with JAVA","Jane Doe")
           
        );
    }

}
