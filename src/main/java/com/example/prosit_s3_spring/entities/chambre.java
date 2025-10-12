package com.example.prosit_s3_spring.entities;

import com.example.prosit_s3_spring.entities.enums.TypeChambre;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long idChambre;
   Long numeroChambre;
    TypeChambre typeC ;


    @ManyToOne
    Bloc blocChambre;


@OneToMany(cascade = CascadeType.ALL)


Set<Reservation> chambreReservation;


}
