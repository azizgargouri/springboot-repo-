package com.example.prosit_s3_spring.repositories;

import com.example.prosit_s3_spring.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
