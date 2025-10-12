package com.example.prosit_s3_spring.entities;

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
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFoyer  ;
    String nomFoyer ;
    Long capaciteFoyer ;



    @OneToOne(mappedBy="FoyerUniversity")
     Universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="FoyerBloc")
    private Set<Bloc> BlocFoyer;
}
