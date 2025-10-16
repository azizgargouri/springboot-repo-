package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.Universite;

import java.util.List;

public interface IUniversiteServices {

    Universite addUniversite(Universite Universite);
    Universite updateUniversite(Universite Universite);
    void deleteUniversiteById(long id);
    Universite getUniversiteById(long id);
    List<Universite> getllUniversite();


}
