package tn.esprit.chamekh_eya_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter   //lambook
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Table(name = "t_registration")
public class Registration implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRegistration;
    private Long numRegistration;
     int numWeek;

    @ManyToOne      //migration d'une cle win tsir l visibilité (registaration tal9a l foreign key mte3 skier)
    Skier skier;

    @ManyToOne
    Course course;
}
