package tn.esprit.chamekh_eya_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.chamekh_eya_4twin5.entities.Skier;
import tn.esprit.chamekh_eya_4twin5.entities.TypeSubscription;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


//3anna CrudRepository w PagingAndSortingRepository w JpaRepository
public interface ISkierRepository extends CrudRepository <Skier, Long>  {

    List<Skier> findByFirstNameAndLastName(String FirstName, String LastName);
    List<Skier> findBySubscription_Typesubscription(TypeSubscription typeSubscription);
    Skier findFirstByBirthDate(LocalDate date);


}
