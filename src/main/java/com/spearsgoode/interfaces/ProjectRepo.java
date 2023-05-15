package com.spearsgoode.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.spearsgoode.models.Project;

public interface ProjectRepo extends CrudRepository<Project, Integer> {

}
