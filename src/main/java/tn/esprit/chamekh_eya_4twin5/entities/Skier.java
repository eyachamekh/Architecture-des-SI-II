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
    private String FirstName;
    private String LastName;

    private LocalDate birthDate;
    private String city;


    public long getNumSkier() {
        return numSkier;
    }

    public void setNumSkier(long numSkier) {
        this.numSkier = numSkier;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Set<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Set<Registration> registrations) {
        this.registrations = registrations;
    }

    public Set<Piste> getPistes() {
        return pistes;
    }

    public void setPistes(Set<Piste> pistes) {
        this.pistes = pistes;
    }

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}) //child   1
    Subscription subscription;     //parent   *

    @OneToMany(mappedBy = "skier" , fetch = FetchType.EAGER)  //skier howa child  ..mapped by dima f child
    Set<Registration> registrations;

    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;   //yetesna3 table associatif (etape loula )


}
