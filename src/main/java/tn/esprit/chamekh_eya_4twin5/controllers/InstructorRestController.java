package tn.esprit.chamekh_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.chamekh_eya_4twin5.entities.Instructor;
import tn.esprit.chamekh_eya_4twin5.service.IInstructorService;

@RequiredArgsConstructor
@RequestMapping("Instructor")
@RestController
public class InstructorRestController {
    private final IInstructorService instructorServices;
    @PostMapping("/add")
    public Instructor saveInstructor(@RequestBody Instructor instructor){
        return instructorServices.addInstructor(instructor);
    }

    @GetMapping("/get/{numInstructor}")
    public Instructor getInstructor(@PathVariable Long numInstructor){
        return instructorServices.retriveInstructor(numInstructor);

    }
}
