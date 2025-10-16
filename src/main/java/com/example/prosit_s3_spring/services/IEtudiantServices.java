package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.Etudiant;
import com.example.prosit_s3_spring.entities.chambre;

import java.util.List;

public interface IEtudiantServices  {


    Etudiant addEtudiant(Etudiant Etudiant);
    Etudiant updateEtudiant(Etudiant Etudiant);
    void deleteEtudiantById(long id);
    Etudiant getEtudiantById(long id);
    List<Etudiant> getallEtudiant();






}
