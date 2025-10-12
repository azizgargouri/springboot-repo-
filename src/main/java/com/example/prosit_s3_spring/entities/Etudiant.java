package com.example.prosit_s3_spring.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEtudiant;
    String nomEt ;
    String prenomEt ;
    long cin;
    String ecole;
    Date dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL)
     Set<Reservation> ReservationEtudiant;




}
