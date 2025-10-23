package com.example.prosit_s3_spring.services;

import com.example.prosit_s3_spring.entities.Foyer;
import com.example.prosit_s3_spring.repositories.ChambreRepository;
import com.example.prosit_s3_spring.repositories.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@AllArgsConstructor

public class IFoyerServicesImp  implements IFoyerServices {


    private  final FoyerRepository FoyerRepository;


    @Override
    public Foyer addFoyer(Foyer Foyer) {
        return FoyerRepository.save(Foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer Foyer) {
        return FoyerRepository.save(Foyer);
    }

    @Override
    public void deleteFoyerById(long id) {
        FoyerRepository.deleteById(id);

    }

    @Override
    public Foyer getFoyerById(long id) {
        return FoyerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Foyer> getallFoyer() {
      return FoyerRepository.findAll();
    }
}
