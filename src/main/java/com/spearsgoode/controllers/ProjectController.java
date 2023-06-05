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
        n.setLink(link);
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
    public String getAllProjects(Model model) {
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
    curl http://localhost:8080/projects/add -d title=TESTx -d etc
    curl http://localhost:8080/projects/add -d title=Abstract-Artwork.com -d tag=Abstract -d "date=Completed: April 2019" -d img=abstract-artwork -d "alt=Abstract-Artwork.com home page screenshot" -d link=https://archive.spearsgoode.com/abstract-artwork.com -d "intro=Haven for Abstract Artists. View abstract artwork from around the globe, meet other abstract artists, and find out what inspires them." -d info=testInfo

remove entry from DB:
    curl http://localhost:8080/projects/delete -d id=x


TO DO
    setup persistence
    upload projects
*/
