package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.Bloc;
import com.example.prosit_s3_spring.entities.chambre;
import com.example.prosit_s3_spring.repositories.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IBlocServicesImp implements IBlocServices {

    @Autowired
    private BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc Bloc) {
        return blocRepository.save(Bloc);
    }

    @Override
    public Bloc updateBloc(Bloc Bloc) {
        return blocRepository.save(Bloc);
    }

    @Override
    public void deleteBlocById(long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc getBlocById(long id) {
        return blocRepository.findById(id).orElse(null);
    }

    @Override
    public List<Bloc> getllBloc() {
        return blocRepository.findAll();
    }



}
