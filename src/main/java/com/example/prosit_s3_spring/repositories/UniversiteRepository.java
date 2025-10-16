package com.example.prosit_s3_spring.repositories;

import com.example.prosit_s3_spring.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository  extends JpaRepository<Universite,Long> {
}
