package tn.esprit.chamekh_eya_4twin5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.chamekh_eya_4twin5.entities.Registration;
import tn.esprit.chamekh_eya_4twin5.repositories.IRegistrationRepository;

import java.util.List;

@Primary
@RequiredArgsConstructor
@Service
public class RegistrationServicesImpl implements IRegistrationService{
    private final IRegistrationRepository RegistrationRepository;
    @Override
    public Registration addRegistration(Registration registration) {

        return RegistrationRepository.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return null;
    }

    @Override
    public Registration retriveRegistration(Long numRegistration) {
        return null;
    }

    @Override
    public List<Registration> retriveAll() {
        return null;
    }

    @Override
    public void removeRegistration(Long numRegistration) {

    }
}
