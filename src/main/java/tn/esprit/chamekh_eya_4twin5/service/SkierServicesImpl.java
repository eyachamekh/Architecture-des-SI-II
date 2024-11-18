package tn.esprit.chamekh_eya_4twin5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.chamekh_eya_4twin5.entities.*;
import tn.esprit.chamekh_eya_4twin5.repositories.IPisteRepository;
import tn.esprit.chamekh_eya_4twin5.repositories.ISkierRepository;

import java.awt.Color;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
@Primary
@RequiredArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices {

    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    private final IRegistrationService RegistrationRepository;
    private final ISubscriptionService SubscriptionRepository;
    private final ICourseService CourseRepository;

    public Skier addSkier(Skier skier){
        return skierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return  skierRepository.save(skier);
    }

    @Override
    public Skier retriveSkier(Long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public List<Skier> retriveAll() {
        return (List <Skier>)skierRepository.findAll();
    }

    @Override
    public void removeSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);
    }


    @Override
    public Skier getByDate(LocalDate date) {
        return skierRepository.findFirstByBirthDate(date);
    }


    @Override
    public Skier findByFirstNameAndLastName(String FirstName, String LastName) {
        return null;
    }

    //skier to piste

    @Override
    public List<Skier> assignSkierToPiste(String firstName, String lastName, tn.esprit.chamekh_eya_4twin5.entities.Color color) {
        List<Skier> skier = skierRepository.findByFirstNameAndLastName(firstName, lastName);
        List<Piste> piste = pisteRepository.findByColor(color);
        for(Skier s : skier) {
            for(Piste p : piste) {
                p.getSkiers().add(s);
            }
            skierRepository.save(s);
        }
        return skier;
    }


//skier to course
    @Override
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse) {
        Subscription subscription = new Subscription();
        skier.setSubscription(subscription);
        SubscriptionRepository.addSubscription(subscription);
        Course course = CourseRepository.retriveCourse(numCourse);
        Registration registration = new Registration();
        registration.setCourse(course);
        registration.setSkier(skier);
        if (skier.getRegistrations() == null) {
            skier.setRegistrations(new HashSet<>());
        }
        skier.getRegistrations().add(registration);
        RegistrationRepository.addRegistration(registration);
        return skierRepository.save(skier);
    }

//skier subscriptiontype
    @Override
    public List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription) {
        return skierRepository.findBySubscription_Typesubscription(typeSubscription);
    }



}
