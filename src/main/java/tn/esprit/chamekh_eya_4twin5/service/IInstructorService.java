package tn.esprit.chamekh_eya_4twin5.service;

import tn.esprit.chamekh_eya_4twin5.entities.Instructor;

import java.util.List;

public interface IInstructorService {
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    Instructor retriveInstructor(Long numInstructor);
    List<Instructor> retriveAll();
    void removeInstructor(Long numInstructor);
}
