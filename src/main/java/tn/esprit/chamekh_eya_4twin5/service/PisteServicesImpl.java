package tn.esprit.chamekh_eya_4twin5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.chamekh_eya_4twin5.entities.Piste;
import tn.esprit.chamekh_eya_4twin5.repositories.IPisteRepository;
import java.util.List;
@Primary
@RequiredArgsConstructor
@Service
public class PisteServicesImpl implements IPisteService{
    private final IPisteRepository PisteRepository;
    @Override
    public Piste addPiste(Piste piste) {
        return PisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return null;
    }

    @Override
    public Piste retrivePiste(Long numPiste) {
        return null;
    }

    @Override
    public List<Piste> retriveAll() {
        return null;
    }

    @Override
    public void removePiste(Long numPiste) {

    }

}
