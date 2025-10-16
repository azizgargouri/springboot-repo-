package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.Foyer;
import com.example.prosit_s3_spring.entities.chambre;

import java.util.List;

public interface IFoyerServices {

    Foyer addFoyer(Foyer Foyer);
    Foyer updateFoyer(Foyer Foyer);
    void deleteFoyerById(long id);
    Foyer getFoyerById(long id);
    List<Foyer> getallFoyer();


}
