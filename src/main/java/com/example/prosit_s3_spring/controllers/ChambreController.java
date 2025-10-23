package com.example.prosit_s3_spring.controllers;

import com.example.prosit_s3_spring.entities.chambre;

import com.example.prosit_s3_spring.services.IChambreServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/chambre")



public class ChambreController {

    private final IChambreServices iChambreServices;



    @PostMapping
    public chambre addChambre (@RequestBody chambre chambre){
        return iChambreServices.addChambre(chambre);
    }

    @PutMapping
    public chambre updateChambre(@RequestBody chambre chambre){
        return iChambreServices.updateChambre(chambre);
    }

    @DeleteMapping ("/delete/{id}")
    public void  deleteChambre(@PathVariable Long id){

      iChambreServices.deleteChambreById(id);
    }

    @GetMapping("/getChambreById/{id}")
    public chambre getChambreById(@PathVariable Long id){
        return iChambreServices.getChambreById(id);
    }

    @GetMapping
    public List<chambre> getAllChambre(){
        return iChambreServices.getllChambre();
    }



}
