package tn.esprit.chamekh_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.chamekh_eya_4twin5.entities.Subscription;
import tn.esprit.chamekh_eya_4twin5.service.ISubscriptionService;

@RequiredArgsConstructor
@RequestMapping("Subscription")
@RestController
public class SubscriptionRestController {
    private final ISubscriptionService subscriptionServices;
    @PostMapping("/add")
    public Subscription saveSubscription(@RequestBody Subscription subscription){
        return subscriptionServices.addSubscription(subscription);
    }

    @GetMapping("/get/{numSubscription}")
    public Subscription getSubscription(@PathVariable Long numSubscription){
        return subscriptionServices.retriveSubscription(numSubscription);

    }
}
