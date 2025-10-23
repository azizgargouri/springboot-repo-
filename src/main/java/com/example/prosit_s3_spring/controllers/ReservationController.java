package com.example.prosit_s3_spring.controllers;

import com.example.prosit_s3_spring.entities.Reservation;
import com.example.prosit_s3_spring.entities.chambre;
import com.example.prosit_s3_spring.services.IBlocServices;
import com.example.prosit_s3_spring.services.IReservationServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/reservation")
public class ReservationController  {
    private final IReservationServices iReservationServices;


    @PostMapping
    public Reservation addReservation (@RequestBody Reservation reservation){
        return iReservationServices.addReservation(reservation);
    }


    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation reservation){
        return iReservationServices.updateReservation(reservation);
    }

    @DeleteMapping ("/delete/{id}")
    public void  deleteReservation(@PathVariable String id){

        iReservationServices.deleteReservationById(id);
    }

    @GetMapping("/getReservationById/{id}")
    public Reservation getReservationById(@PathVariable String id){
        return iReservationServices.getReservationById(id);
    }

    @GetMapping
    public List<Reservation> getAllReservation() {
        return iReservationServices.getallReservation();

    }


}
