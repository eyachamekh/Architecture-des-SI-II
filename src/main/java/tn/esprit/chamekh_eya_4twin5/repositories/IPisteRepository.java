package tn.esprit.chamekh_eya_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.chamekh_eya_4twin5.entities.Piste;

import java.awt.*;
import java.util.List;
import java.util.Optional;

public interface IPisteRepository extends CrudRepository<Piste, Long> {

    List<Piste> findByColor(Color color);

    List<Piste> findByColor(tn.esprit.chamekh_eya_4twin5.entities.Color color);
}
