package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IReservationServices {

    Reservation addReservation(Reservation Reservation);
    Reservation updateReservation(Reservation Reservation);
    void deleteReservationById(String id);
    Reservation getReservationById(String id);
    List<Reservation> getallReservation();
}
