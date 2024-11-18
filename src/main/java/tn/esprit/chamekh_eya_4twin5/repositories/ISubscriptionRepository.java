package tn.esprit.chamekh_eya_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.chamekh_eya_4twin5.entities.Subscription;
import tn.esprit.chamekh_eya_4twin5.entities.TypeSubscription;

import java.util.Set;

public interface ISubscriptionRepository extends CrudRepository<Subscription, Long> {
    Set<Subscription> findByTypesubscription(TypeSubscription type);
}
