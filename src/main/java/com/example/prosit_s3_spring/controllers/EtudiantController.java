package com.example.prosit_s3_spring.controllers;

import com.example.prosit_s3_spring.services.IBlocServices;
import com.example.prosit_s3_spring.services.IEtudiantServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/etudiant")
public class EtudiantController {

    private final IEtudiantServices etudiantServices;
}
