package com.example.prosit_s3_spring.repositories;

import com.example.prosit_s3_spring.entities.Bloc;
import com.example.prosit_s3_spring.entities.chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChambreRepository extends JpaRepository <chambre, Long> {


    List<chambre> findByBlocChambre_NomBloc(String nomBloc); //keywords


  @Query  ("SELECT c FROM chambre c JOIN Bloc blc where  c.blocChambre =: nomBloc") //jpql
    List<chambre> findByBlocChambreJPQL(String nomBloc);

//nativeQuery
    @Query(value = "SELECT c.* FROM chambre c " +
            "JOIN bloc b ON c.bloc_chambre_id_bloc = b.id_bloc " +
            "WHERE b.nom_bloc = :nomBloc",
            nativeQuery = true)
    List<chambre> findByBlocNameChambreNative( String nomBloc);

}

//keywords  :  List<chambre> findByBlocChambre_NomBloc(String nomBloc);
//JPQL :
//NativeQuery :



//we cana't use keyword when we can't access the other entity so we use instead jpql