package com.example.jpaboot.dao;

import org.springframework.data.repository.CrudRepository;
  
import com.example.jpaboot.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

}