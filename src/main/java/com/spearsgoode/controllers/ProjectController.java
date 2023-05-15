package com.spearsgoode.controllers;

import com.spearsgoode.interfaces.ProjectRepo;
import com.spearsgoode.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Project> getAllProjects() {
        return projectRepo.findAll();
    }






}
