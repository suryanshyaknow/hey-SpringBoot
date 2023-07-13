package com.example.spring_data_rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.spring_data_rest.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens") // to not have to use a @Controller class
public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
