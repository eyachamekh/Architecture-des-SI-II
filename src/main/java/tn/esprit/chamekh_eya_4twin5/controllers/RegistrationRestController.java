package tn.esprit.chamekh_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.chamekh_eya_4twin5.entities.Registration;
import tn.esprit.chamekh_eya_4twin5.service.IRegistrationService;


@RequiredArgsConstructor
@RequestMapping("Registration")
@RestController
public class RegistrationRestController {
    private final IRegistrationService registrationServices;
    @PostMapping("/add")
    public Registration saveRegistration(@RequestBody Registration registration){
        return registrationServices.addRegistration(registration);
    }

    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration){
        return registrationServices.retriveRegistration(numRegistration);

    }
}