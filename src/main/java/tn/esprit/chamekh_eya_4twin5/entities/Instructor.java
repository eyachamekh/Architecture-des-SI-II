package tn.esprit.chamekh_eya_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter   //lambook
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Table(name = "t_instructor")
public class Instructor implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInstructor;
    private Long numInstructor;
    private String firstName;
    private String lastName;
    private LocalDate dateOfHire;

    //generation d'une table hounni
    @OneToMany
    Set<Course> courses;


}
