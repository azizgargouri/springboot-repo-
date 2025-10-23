package com.example.prosit_s3_spring.controllers;

import com.example.prosit_s3_spring.services.IBlocServices;
import com.example.prosit_s3_spring.services.IChambreServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/chambre")



public class ChambreController {

    private final IChambreServices iChambreServices;
}
