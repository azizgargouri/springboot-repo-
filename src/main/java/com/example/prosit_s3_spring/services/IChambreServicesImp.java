package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.chambre;
import com.example.prosit_s3_spring.repositories.ChambreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IChambreServicesImp implements IChambreServices {
@Autowired
private ChambreRepository chambreRepository;


    @Override
    public chambre addChambre(chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public chambre updateChambre(chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambreById(long id) {
     chambreRepository.deleteById(id);
    }

    @Override
    public chambre getChambreById(long id) {
     return chambreRepository.findById(id).orElse(null);
    }

    @Override
    public List<chambre> getllChambre() {
        return chambreRepository.findAll();
    }
}
