package com.example.custom_methods_in_crud_repo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.custom_methods_in_crud_repo.model.Alien;
import java.util.List;

// public interface AlienRepo extends CrudRepository<Alien, Integer> {

//     List<Alien> findByTech(String tech); // must follow this naming convention only
//     /*
//      * It kinda eery to know that we are jsut declaring this custom method and
//      * Spring Boot is providing us with a desired implementation.
//      */

//     List<Alien> findByAidGreaterThan(int aid); // merely declaring

//     // Now's let's see how can we implement somewhat kinda complex queries
//     @Query("from Alien where tech=?1 order by aname")
//     List<Alien> findByTechSorted(String tech);
// }

// Crud Repository + Some Extra Features
public interface AlienRepo extends JpaRepository<Alien, Integer> {

}