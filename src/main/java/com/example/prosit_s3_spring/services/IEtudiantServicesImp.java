package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.Etudiant;
import com.example.prosit_s3_spring.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service

@AllArgsConstructor

public class IEtudiantServicesImp implements IEtudiantServices {

// @Autowired
private final EtudiantRepository EtudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant Etudiant) {
        return EtudiantRepository.save(Etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant Etudiant) {
        return EtudiantRepository.save(Etudiant);
    }

    @Override
    public void deleteEtudiantById(long id) {
        EtudiantRepository.deleteById(id);

    }

    @Override
    public Etudiant getEtudiantById(long id) {
        return EtudiantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Etudiant> getallEtudiant() {
        return EtudiantRepository.findAll();
    }
}
