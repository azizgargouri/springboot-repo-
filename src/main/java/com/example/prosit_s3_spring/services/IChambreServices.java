package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.chambre;

import java.util.List;

public interface IChambreServices {

    chambre addChambre(chambre chambre);
    chambre updateChambre(chambre chambre);
    void deleteChambreById(long id);
    chambre getChambreById(long id);
    List<chambre> getllChambre();

}
