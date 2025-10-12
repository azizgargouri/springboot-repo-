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
public class Reservation {
    @Id
   String idReservation ;
   Date anneeUniversitaire;
   boolean estValide ;

    //@ManyToOne(cascade = CascadeType.ALL)
    //Bloc bloc;


    @ManyToMany(mappedBy="ReservationEtudiant",cascade = CascadeType.ALL)
    private Set<Etudiant> etudiantReservation;





}
