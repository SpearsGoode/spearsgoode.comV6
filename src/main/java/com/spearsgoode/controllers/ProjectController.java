package com.spearsgoode.controllers;

import com.spearsgoode.interfaces.ProjectRepo;
import com.spearsgoode.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/projects")
public class ProjectController {
    @Autowired
    private ProjectRepo projectRepo;

    @PostMapping(path="/add")
    public @ResponseBody String addNewProject (@RequestParam String title) {

        Project n = new Project();
        n.setTitle(title);
        n.setTag("testTag");
        n.setDate("testDate");
        n.setImg("testImg");
        n.setAlt("testAlt");
        n.setLink("testLink");
        n.setIntro("testIntro");
        n.setInfo("testInfo");
        projectRepo.save(n);
        return "Saved";
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
        modifies local text file
            JSON or XML

refreshDB();
    checkEmpty();
    if yes add locally stored projects
    if no: return 1


COMMON NOTES:
    research CRUD in general
    decide: JSON or XML
    research access control & spring.security to protect ability to modify projects
*/
