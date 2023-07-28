package com.spearsgoode.controllers;

import com.spearsgoode.interfaces.ProjectRepo;
import com.spearsgoode.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/projects")
public class ProjectController {
    @Autowired
    private ProjectRepo projectRepo;

    // Handles POST requests for adding a new project
    @PostMapping(path="/add")
    public @ResponseBody String addNewProject(
            @RequestParam String title,
            @RequestParam String tag,
            @RequestParam String date,
            @RequestParam String img,
            @RequestParam String alt,
            @RequestParam String link,
            @RequestParam String intro,
            @RequestParam String info) {

        Project n = new Project(title, tag, date, img, alt, link, intro, info);
        projectRepo.save(n);
        return "Saved";
    }

    // Handles POST requests for deleting a project by ID
    @PostMapping(path="/delete")
    public @ResponseBody String deleteProject(@RequestParam Integer id) {
        if (id == 0) projectRepo.deleteAll();   // delete all if id=0
        else projectRepo.deleteById(id);
        return "Deleted";
    }

    // Handles GET requests for displaying all projects
    @GetMapping
    public String getAttributes(Model model) {
        Iterable<Project> projects = projectRepo.findAll();
        model.addAttribute("projects", projects);
        return "projects";
    }

}

/*
Functionality Needed:
    addProject
    addToLocal
    removeProject -- Research crudRepository
    refreshDB
    checkEmpty -- Research crudRepository

addProject();
    collect data from form
    common sense checks
    try: store data appropriately
    if errors: cancel & print error message
    create project object
    addToLocal();
    projectRepo.save(project);

addToLocal();
    NOTE:
        takes project object
        modifies local modal.html file
            JSON or XML


COMMON NOTES:
    research CRUD in general
    research access control & spring.security to protect ability to modify projects

add entry to DB:
  Template:
    curl http://localhost:8080/projects/add -d title=x -d tag=x -d "date=x" -d img=x -d "alt=x" -d link=x -d "intro=x" -d info=x
  Abstract-Artwork.com
    curl http://localhost:8080/projects/add -d title=Abstract-Artwork.com -d tag=abstract -d "date=Completed: April 2019" -d img=abstract-artwork.jpg -d "alt=Abstract-Artwork.com home page screenshot" -d link=https://archive.spearsgoode.com/abstract-artwork.com -d "intro=Haven for Abstract Artists. View abstract artwork from around the globe, meet other abstract artists, and find out what inspires them." -d info=abstract
  Armada DAO: FIXME
    curl http://localhost:8080/projects/add -d "title=Ape Armada DAO" -d tag=armada -d "date=Discontinued: October 2022" -d img=ape_soldier.jpg -d "alt=Ape Armada Ape Soldier" -d link=null -d "intro=A Play to Earn, Multiplayer, First Person Shooter designed to tackle significant problems concerning the design of current generation Play to Earn (P2E) games" -d info=armada
  aHODLm: FIXME
    curl http://localhost:8080/projects/add -d "title=aHODLm Indicator" -d tag=aHODLm -d "date=Shelved: August 2020" -d img=aHODLm.jpg -d "alt=aHODLm indicator BTC example" -d link=null -d "intro=Detects likelihood of significant movements. At points of high risk it takes profit and at points of low risk it increases the position size. Since its inception it has proven its ability to swing trade effectively with minimal oversight." -d info=aHODLm
  SpearsGoode.com:
    curl http://localhost:8080/projects/add -d title=SpearsGoode.com -d tag=sg -d date=Ongoing -d img=SGlogoV2tall.svg -d "alt=Spears Goode Logo" -d link=https://archive.spearsgoode.com/ -d "intro=My personal website that displays important projects and artwork I've created. The motivation behind this project was initially to document my web development journey and store my artwork. Previous versions are available in the archive." -d info=sg

remove entry from DB:
    curl http://localhost:8080/projects/delete -d id=x
        -ID can be found by highlighting the title bar of any modal


TO DO
    setup persistence
    upload projects
*/
