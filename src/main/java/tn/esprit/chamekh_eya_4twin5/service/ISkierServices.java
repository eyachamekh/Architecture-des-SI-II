package tn.esprit.chamekh_eya_4twin5.service;

import tn.esprit.chamekh_eya_4twin5.entities.Skier;

import java.util.List;

public interface ISkierServices {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    Skier retriveSkier(Long skier);
    List<Skier> retriveAll();
    void removeSkier(Long numSkier);
}
