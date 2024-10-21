package tn.esprit.chamekh_eya_4twin5.service;

import tn.esprit.chamekh_eya_4twin5.entities.Piste;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    Piste retrivePiste(Long numPiste);
    List<Piste> retriveAll();
    void removePiste(Long numPiste);
}
