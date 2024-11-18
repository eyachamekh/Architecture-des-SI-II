package tn.esprit.chamekh_eya_4twin5.service;

import tn.esprit.chamekh_eya_4twin5.entities.Skier;
import tn.esprit.chamekh_eya_4twin5.entities.TypeSubscription;

import java.time.LocalDate;
import java.util.List;

public interface ISkierServices {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    Skier retriveSkier(Long skier);
    List<Skier> retriveAll();
    void removeSkier(Long numSkier);


    Skier getByDate(LocalDate birthDate);

    Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);
    List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription);

    List<Skier> assignSkierToPiste(String firstName, String lastName, tn.esprit.chamekh_eya_4twin5.entities.Color color);

    Skier findByFirstNameAndLastName(String firstName, String lastName);
}
