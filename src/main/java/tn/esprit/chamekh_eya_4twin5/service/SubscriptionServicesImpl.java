package tn.esprit.chamekh_eya_4twin5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.chamekh_eya_4twin5.entities.Subscription;
import tn.esprit.chamekh_eya_4twin5.repositories.ISubscriptionRepository;

import java.util.List;

@Primary
@RequiredArgsConstructor
@Service
public class SubscriptionServicesImpl implements ISubscriptionService{
    private final ISubscriptionRepository subscriptionRepository;
    public Subscription addSubscription(Subscription subscription){

        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return null;
    }

    @Override
    public Subscription retriveSubscription(Long subscription) {
        return null;
    }

    @Override
    public List<Subscription> retriveAll() {
        return null;
    }

    @Override
    public void removeSubscription(Long numSubscription) {

    }


}
