package tn.esprit.chamekh_eya_4twin5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.chamekh_eya_4twin5.entities.Instructor;
import tn.esprit.chamekh_eya_4twin5.repositories.IInstructorRepository;

import java.util.List;

@Primary
@RequiredArgsConstructor
@Service
public class InstructorServicesImpl implements IInstructorService{
    private final IInstructorRepository InstructorRepository;
    @Override
    public Instructor addInstructor(Instructor instructor) {
        return InstructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return null;
    }

    @Override
    public Instructor retriveInstructor(Long numInstructor) {
        return null;
    }

    @Override
    public List<Instructor> retriveAll() {
        return null;
    }

    @Override
    public void removeInstructor(Long numInstructor) {

    }
}
