package com.example.prosit_s3_spring.controllers;

import com.example.prosit_s3_spring.entities.Etudiant;
import com.example.prosit_s3_spring.entities.chambre;
import com.example.prosit_s3_spring.services.IBlocServices;
import com.example.prosit_s3_spring.services.IEtudiantServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/etudiant")
public class EtudiantController {

    private final IEtudiantServices etudiantServices;


    @PostMapping
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantServices.addEtudiant(etudiant);
    }

    @PutMapping
    public Etudiant updateEtudiant(@RequestBody Etudiant Etudiant) {
        return etudiantServices.updateEtudiant(Etudiant);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable Long id) {

        etudiantServices.deleteEtudiantById(id);
    }

    @GetMapping("/getEtudiantById/{id}")
    public Etudiant getEtudiantById(@PathVariable Long id) {
        return etudiantServices.getEtudiantById(id);
    }

    @GetMapping
    public List<Etudiant> getAllEtudiant() {
        return etudiantServices.getallEtudiant();

    }
}
