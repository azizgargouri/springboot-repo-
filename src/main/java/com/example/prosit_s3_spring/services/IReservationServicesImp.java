package com.example.prosit_s3_spring.services;


import com.example.prosit_s3_spring.entities.Reservation;
import com.example.prosit_s3_spring.repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@AllArgsConstructor

public class IReservationServicesImp implements IReservationServices {
    //@Autowired
    private final ReservationRepository reservationRepository;



    @Override
    public Reservation addReservation(Reservation Reservation) {
        return reservationRepository.save(Reservation);
    }

    @Override
    public Reservation updateReservation(Reservation Reservation) {
        return reservationRepository.save(Reservation);
    }

    @Override
    public void deleteReservationById(String id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation getReservationById(String id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> getallReservation() {
        return reservationRepository.findAll();
    }









}
