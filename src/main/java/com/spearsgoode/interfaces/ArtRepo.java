package com.spearsgoode.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.spearsgoode.models.Art;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtRepo extends CrudRepository<Art, Integer> {

}