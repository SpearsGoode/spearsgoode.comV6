package com.spearsgoode.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.spearsgoode.models.Project;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends CrudRepository<Project, Integer> {

}
