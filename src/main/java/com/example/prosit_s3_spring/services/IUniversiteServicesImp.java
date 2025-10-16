package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.Universite;
import com.example.prosit_s3_spring.repositories.ChambreRepository;
import com.example.prosit_s3_spring.repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class IUniversiteServicesImp  implements IUniversiteServices {

    @Autowired
    private UniversiteRepository UniversiteRepository;


    @Override
    public Universite addUniversite(Universite Universite) {
        return UniversiteRepository.save(Universite);
    }

    @Override
    public Universite updateUniversite(Universite Universite) {
        return UniversiteRepository.save(Universite);
    }

    @Override
    public void deleteUniversiteById(long id) {

    }

    @Override
    public Universite getUniversiteById(long id) {
        return UniversiteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Universite> getllUniversite() {
        return UniversiteRepository.findAll();
    }
}
