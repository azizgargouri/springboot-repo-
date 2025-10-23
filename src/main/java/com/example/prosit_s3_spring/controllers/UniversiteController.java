package com.example.prosit_s3_spring.controllers;

import com.example.prosit_s3_spring.entities.Universite;
import com.example.prosit_s3_spring.entities.chambre;
import com.example.prosit_s3_spring.services.IBlocServices;
import com.example.prosit_s3_spring.services.IUniversiteServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/universite")
public class UniversiteController {
    private final IUniversiteServices universiteServices;


    @PostMapping
    public Universite addUniversite (@RequestBody Universite universite){
        return universiteServices.addUniversite(universite);
    }

    @PutMapping
    public Universite updateUniversite(@RequestBody Universite universite){
        return universiteServices.updateUniversite(universite);
    }

    @DeleteMapping ("/delete/{id}")
    public void  deleteUniversite(@PathVariable Long id){
        universiteServices.deleteUniversiteById(id);
    }

    @GetMapping("/getUniversiteById/{id}")
    public Universite getUniversiteById(@PathVariable Long id){
        return universiteServices.getUniversiteById(id);
    }

    @GetMapping
    public List<Universite> getAllUniversite(){
        return universiteServices.getllUniversite();
    }



}
