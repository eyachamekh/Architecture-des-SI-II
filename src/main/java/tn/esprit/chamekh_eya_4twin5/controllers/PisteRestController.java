package tn.esprit.chamekh_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.chamekh_eya_4twin5.entities.Piste;
import tn.esprit.chamekh_eya_4twin5.service.IPisteService;


@RequiredArgsConstructor
@RequestMapping("Piste")
@RestController
public class PisteRestController {
    private final IPisteService pisteServices;
    @PostMapping("/add")
    public Piste savePiste(@RequestBody Piste piste){
        return pisteServices.addPiste(piste);
    }

    @GetMapping("/get/{numPiste}")
    public Piste getPiste(@PathVariable Long numPiste){
        return pisteServices.retrivePiste(numPiste);

    }
}
