package tn.esprit.chamekh_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.chamekh_eya_4twin5.entities.Skier;
import tn.esprit.chamekh_eya_4twin5.service.ISkierServices;

@RequiredArgsConstructor
@RequestMapping("skier")
@RestController
public class SkierRestController {
    private final ISkierServices skierServices;
    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier){
        return skierServices.addSkier(skier);
    }

    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier){
        return skierServices.retriveSkier(numSkier);

    }
}
