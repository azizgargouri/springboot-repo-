package com.example.prosit_s3_spring.repositories;

import com.example.prosit_s3_spring.entities.chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository <chambre, Long> {


}
