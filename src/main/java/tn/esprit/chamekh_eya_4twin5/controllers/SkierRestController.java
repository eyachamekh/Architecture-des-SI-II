package tn.esprit.chamekh_eya_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.chamekh_eya_4twin5.entities.Skier;
import tn.esprit.chamekh_eya_4twin5.entities.TypeSubscription;
import tn.esprit.chamekh_eya_4twin5.service.ISkierServices;
import tn.esprit.chamekh_eya_4twin5.entities.Color;


import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("skier")
@RestController
public class SkierRestController {
    private final ISkierServices skierServices;
    @Operation(description = "ajouter un skieur de la base de données")
    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier){
        return skierServices.addSkier(skier);
    }

    @Operation(description = "modifier un skieur de la base de données")
    @PutMapping("/update")
    public Skier updateSkieur(@RequestBody Skier skieur) {
        return skierServices.updateSkier(skieur);
    }

    @Operation(description = "récupérer un skieur par num de la base de données")
    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier){
        return skierServices.retriveSkier(numSkier);

    }
    @GetMapping("/assignSkierToPiste/{FirstName}/{LastName}/{color}")
    public List<Skier> assignSkierToPiste(
            @PathVariable String FirstName,
            @PathVariable String LastName,
            @PathVariable Color color) {
        return skierServices.assignSkierToPiste(FirstName, LastName, color);
    }

    @Operation(description = "récupérer un skieur par lastname et firstname de la base de données")
    @GetMapping("/getByFLName/{FirstName}/{LastName}")
    public Skier getSkierByFLname(@PathVariable String FirstName,String LastName){
        return skierServices.findByFirstNameAndLastName(FirstName,LastName);
    }
/////////////////
    @Operation(description = "récupérer un skieur par birthdate de la base de données")
    @GetMapping("/getByDate/{birthDate}")
    public Skier getByBirthDate(@PathVariable LocalDate birthDate) {
        return skierServices.getByDate(birthDate);
    }

    @PostMapping("/addSkierAndAssignToCourse/{numCourse}")
    public Skier addSkierAndAssignToCourse(@RequestBody Skier skier, @PathVariable Long numCourse) {
        return skierServices.addSkierAndAssignToCourse(skier, numCourse);
    }

    @GetMapping("/retrieveBySubscriptionType")
    public List<Skier> retrieveSkiersBySubscriptionType(@RequestParam TypeSubscription typeSubscription) {
        return skierServices.retrieveSkiersBySubscriptionType(typeSubscription);
    }


}
