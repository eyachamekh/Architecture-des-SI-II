package tn.esprit.chamekh_eya_4twin5.service;

import tn.esprit.chamekh_eya_4twin5.entities.Course;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course course);
    Course updateCourse(Course course);
    Course retriveCourse(Long numCourse);
    List<Course> retriveAll();
    void removeCours(Long numCours);

}
