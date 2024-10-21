package tn.esprit.chamekh_eya_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Getter   //lambook
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Table(name = "t_course")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCourse;
    private Long numCourse;
    private int level;
    @Enumerated(EnumType.STRING)

    private TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    private Support support;

    private Float price;
    private int timeSlot;

    @OneToMany (mappedBy = "course")
    Set <Registration> regisration;



}
