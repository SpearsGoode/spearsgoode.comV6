package com.spearsgoode.controllers;

import com.spearsgoode.interfaces.ProjectRepo;
import com.spearsgoode.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
@RequestMapping(path="/projects")
public class ProjectController {
    @Autowired
    private ProjectRepo projectRepo;

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

        Project n = new Project();
        n.setTitle(title);
        n.setTag(tag);
        n.setDate(date);
        n.setImg(img);
        n.setAlt(alt);
        if (link.equals("null")) n.setLink(null);
        else n.setLink(link);
        n.setIntro(intro);
        n.setInfo(info);
        projectRepo.save(n);
        return "Saved";
    }

    @PostMapping(path="/delete")
    public @ResponseBody String deleteProject(@RequestParam Integer id) {
        projectRepo.deleteById(id);
        return "Deleted";
    }

    @GetMapping
    public String getProjects(Model model) {
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

refreshDB();
    checkEmpty();
    if yes add locally stored projects
    if no: return 1


COMMON NOTES:
    research CRUD in general
    decide: JSON or XML
    research access control & spring.security to protect ability to modify projects

add entry to DB:
  Template:
    curl http://localhost:8080/projects/add -d title=x -d tag=x -d "date=x" -d img=x -d "alt=x" -d link=x -d "intro=x" -d info=x
  Abstract-Artwork.com
    curl http://localhost:8080/projects/add -d title=Abstract-Artwork.com -d tag=abstract -d "date=Completed: April 2019" -d img=abstract-artwork.jpg -d "alt=Abstract-Artwork.com home page screenshot" -d link=https://archive.spearsgoode.com/abstract-artwork.com -d "intro=Haven for Abstract Artists. View abstract artwork from around the globe, meet other abstract artists, and find out what inspires them." -d info=abstract
  Armada DAO: FIXME
    curl http://localhost:8080/projects/add -d "title=Armada DAO | Ape Armada" -d tag=armada -d "date=Discontinued: October 2022" -d img=ape_soldier.jpg -d "alt=Ape Armada Ape Soldier" -d link=null -d "intro=A Play to Earn, Multiplayer, First Person Shooter designed to tackle significant problems concerning the design of current generation Play to Earn (P2E) games" -d info=armada
  aHODLm: FIXME
    curl http://localhost:8080/projects/add -d "title=aHODLm Indicator" -d tag=aHODLm -d "date=Shelved: August 2020" -d img=aHODLm.jpg -d "alt=aHODLm indicator BTC example" -d link=null -d "intro=Analyzes price movement to detect likelihood of significant movements. This is presented visually using different colors. At points of high risk it automatically takes profit and at points of low risk it automatically increases the position size. Since its inception it has proven its ability to swing trade effectively with minimal oversight." -d info=aHODLm
  SpearsGoode.com:
    curl http://localhost:8080/projects/add -d title=SpearsGoode.com -d tag=sg -d date=Ongoing -d img=SGlogoV2tall.svg -d "alt=Spears Goode Logo" -d link=https://archive.spearsgoode.com/ -d "intro=My personal website, which has gone through many different iterations. Its current purpose is to display some of the more important projects I've worked on. In previous versions it stored my artwork and had a blog. The motivation behind this project was initally to document my web development journey and store my artwork in an accessible format." -d info=sg

remove entry from DB:
    curl http://localhost:8080/projects/delete -d id=x
        -ID can be found by highlighting the title bar of any modal


TO DO
    setup persistence
    upload projects
*/
