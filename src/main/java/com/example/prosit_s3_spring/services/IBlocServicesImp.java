package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.Bloc;
import com.example.prosit_s3_spring.entities.chambre;
import com.example.prosit_s3_spring.repositories.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
@AllArgsConstructor
public class IBlocServicesImp implements IBlocServices {

    //@Autowired

    private final BlocRepository blocRepository;

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
