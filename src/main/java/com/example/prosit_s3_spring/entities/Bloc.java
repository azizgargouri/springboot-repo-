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
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    Long id_bloc;
    String nomBloc ;
    Long capaciteBloc ;

    @ManyToOne
    Foyer FoyerBloc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="blocChambre")
    private Set<chambre> chambreBloc;


}
