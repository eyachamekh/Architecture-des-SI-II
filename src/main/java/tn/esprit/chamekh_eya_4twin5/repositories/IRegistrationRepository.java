package tn.esprit.chamekh_eya_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.chamekh_eya_4twin5.entities.Course;
import tn.esprit.chamekh_eya_4twin5.entities.Registration;

public interface IRegistrationRepository extends CrudRepository<Registration,Long> {
}
