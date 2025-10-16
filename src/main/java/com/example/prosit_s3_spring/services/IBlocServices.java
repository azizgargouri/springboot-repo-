package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.Bloc;
import com.example.prosit_s3_spring.entities.chambre;

import java.util.List;

public interface IBlocServices {


    Bloc addBloc(Bloc Bloc);
    Bloc updateBloc(Bloc Bloc);
    void deleteBlocById(long id);
    Bloc getBlocById(long id);
    List<Bloc> getllBloc();


}
