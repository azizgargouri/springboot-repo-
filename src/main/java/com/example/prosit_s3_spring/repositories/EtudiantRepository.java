package com.example.prosit_s3_spring.repositories;

import com.example.prosit_s3_spring.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
