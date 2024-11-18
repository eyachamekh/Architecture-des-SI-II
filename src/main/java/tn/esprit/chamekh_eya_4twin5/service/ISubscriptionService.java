package tn.esprit.chamekh_eya_4twin5.service;

import tn.esprit.chamekh_eya_4twin5.entities.Subscription;
import tn.esprit.chamekh_eya_4twin5.entities.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionService {
    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    Subscription retriveSubscription(Long subscription);
    List<Subscription> retriveAll();
    void removeSubscription(Long numSubscription);
    Set<Subscription> getSubscriptionByType(TypeSubscription type);
}
