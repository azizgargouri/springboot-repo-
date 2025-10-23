package com.example.prosit_s3_spring.controllers;

import com.example.prosit_s3_spring.entities.Bloc;
import com.example.prosit_s3_spring.entities.chambre;
import com.example.prosit_s3_spring.services.IBlocServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/bloc")


public class BlocController {


private final IBlocServices iBlocServices;

    @PostMapping
    public Bloc addBloc (@RequestBody Bloc bloc){
        return iBlocServices.addBloc(bloc);
    }

    @PutMapping
    public Bloc updateBloc(@RequestBody Bloc Bloc){
        return iBlocServices.updateBloc(Bloc);
    }

    @DeleteMapping ("/delete/{id}")
    public void  deleteBloc(@PathVariable Long id){

        iBlocServices.deleteBlocById(id);
    }

    @GetMapping("/getBlocById/{id}")
    public Bloc getBlocById(@PathVariable Long id){
        return iBlocServices.getBlocById(id);
    }

    @GetMapping
    public List<Bloc> getAllBloc(){
        return iBlocServices.getllBloc();
    }


}
