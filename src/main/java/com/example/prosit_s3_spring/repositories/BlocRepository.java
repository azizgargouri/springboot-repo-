package com.example.prosit_s3_spring.repositories;

import com.example.prosit_s3_spring.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
