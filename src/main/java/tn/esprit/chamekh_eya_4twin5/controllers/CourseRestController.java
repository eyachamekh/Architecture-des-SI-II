package tn.esprit.chamekh_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.chamekh_eya_4twin5.entities.Course;
import tn.esprit.chamekh_eya_4twin5.service.ICourseService;


@RequiredArgsConstructor
@RequestMapping("Course")
@RestController
public class CourseRestController {
    private final ICourseService courseServices;
    @PostMapping("/add")
    public Course saveCourse(@RequestBody Course course){
        return courseServices.addCourse(course);
    }

    @GetMapping("/get/{numCourse}")
    public Course getCourse(@PathVariable Long numCourse){
        return courseServices.retriveCourse(numCourse);

    }
}
