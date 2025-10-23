package com.example.prosit_s3_spring.controllers;

import com.example.prosit_s3_spring.entities.Foyer;
import com.example.prosit_s3_spring.entities.chambre;
import com.example.prosit_s3_spring.services.IBlocServices;
import com.example.prosit_s3_spring.services.IFoyerServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/bloc")
public class FoyerController {
    private final IFoyerServices iFoyerServices;


    @PostMapping
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return iFoyerServices.addFoyer(foyer);
    }


    @PutMapping
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return iFoyerServices.updateFoyer(foyer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFoyer(@PathVariable Long id) {

        iFoyerServices.deleteFoyerById(id);
    }

    @GetMapping("/getFoyerById/{id}")
    public Foyer getFoyerById(@PathVariable Long id) {
        return iFoyerServices.getFoyerById(id);
    }

    @GetMapping
    public List<Foyer> getAllFoyer() {
        return iFoyerServices.getallFoyer();
    }
}