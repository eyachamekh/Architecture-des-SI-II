package tn.esprit.chamekh_eya_4twin5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.chamekh_eya_4twin5.entities.Skier;
import tn.esprit.chamekh_eya_4twin5.repositories.ISkierRepository;

import java.util.List;
@Primary
@RequiredArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices {

    private final ISkierRepository skierRepository;
    public Skier addSkier(Skier skier){
        return skierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return  skierRepository.save(skier);
    }

    @Override
    public Skier retriveSkier(Long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public List<Skier> retriveAll() {
        return (List <Skier>)skierRepository.findAll();
    }

    @Override
    public void removeSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);
    }
}
