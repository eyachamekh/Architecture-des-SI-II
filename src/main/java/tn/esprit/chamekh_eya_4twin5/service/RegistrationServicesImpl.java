package tn.esprit.chamekh_eya_4twin5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.chamekh_eya_4twin5.entities.Course;
import tn.esprit.chamekh_eya_4twin5.entities.Registration;
import tn.esprit.chamekh_eya_4twin5.entities.Skier;
import tn.esprit.chamekh_eya_4twin5.repositories.ICourseRepository;
import tn.esprit.chamekh_eya_4twin5.repositories.IRegistrationRepository;
import tn.esprit.chamekh_eya_4twin5.repositories.ISkierRepository;

import java.util.List;
import java.util.Optional;

@Primary
@RequiredArgsConstructor
@Service
public class RegistrationServicesImpl implements IRegistrationService{
    private final IRegistrationRepository RegistrationRepository;
    private final ISkierRepository skierRepository;
    private final ICourseRepository courseRepository;
    @Override
    public Registration addRegistration(Registration registration) {

        return RegistrationRepository.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return null;
    }

    @Override
    public Registration retriveRegistration(Long numRegistration) {
        return null;
    }

    @Override
    public List<Registration> retriveAll() {
        return null;
    }

    @Override
    public void removeRegistration(Long numRegistration) {

    }

    //skier
    @Override
    public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier) {
        Skier skier = skierRepository.findById(numSkier).orElse(null);
        registration.setSkier(skier);
        return RegistrationRepository.save(registration);
    }

    //course
    @Override
        public Registration addRegistrationAndAssignToCourse(Registration registration, Long numCourse) {
            Course course = courseRepository.findById(numCourse).orElse(null);
            registration.setCourse(course);
            return RegistrationRepository.save(registration);
    }



}
