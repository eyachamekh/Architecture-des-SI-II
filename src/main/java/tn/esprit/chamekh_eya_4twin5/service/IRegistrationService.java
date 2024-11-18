package tn.esprit.chamekh_eya_4twin5.service;

import tn.esprit.chamekh_eya_4twin5.entities.Registration;

import java.util.List;

public interface IRegistrationService {
    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    Registration retriveRegistration(Long numRegistration);
    List<Registration> retriveAll();
    void removeRegistration(Long numRegistration);

    Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkieur);

    //course
    Registration addRegistrationAndAssignToCourse(Registration registration, Long numCourse);
}
