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
@FieldDefaults (level= AccessLevel.PRIVATE)
@Entity
@Table(name = "t_skier")
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //hybernet auto yasna3 table jdida ,,,table ya3mel
    private  long numSkier;
    private String firstName;
    private String lastName;

    private LocalDate birthDate;
    private String city;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}) //child   1
    Subscription subscription;     //parent   *

    @OneToMany(mappedBy = "skier" , fetch = FetchType.EAGER)  //skier howa child  ..mapped by dima f child
    Set<Registration> registrations;

    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;   //yetesna3 table associatif (etape loula )


}
