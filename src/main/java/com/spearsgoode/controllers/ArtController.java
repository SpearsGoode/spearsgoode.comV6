package com.spearsgoode.controllers;

import com.spearsgoode.interfaces.ArtRepo;
import com.spearsgoode.interfaces.ProjectRepo;
import com.spearsgoode.models.Art;
import com.spearsgoode.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/art")
public class ArtController {

    @Autowired
    private ProjectRepo projectRepo;
    @Autowired
    private ArtRepo artRepo;

    @PostMapping(path="/add")
    public @ResponseBody String addNewArt(
            @RequestParam String title,
            @RequestParam String medium,
            @RequestParam String imgFull,
            @RequestParam String imgComp,
            @RequestParam String type,
            @RequestParam String category,
            @RequestParam Double height,
            @RequestParam Double width,
            @RequestParam Boolean feature) {

        Art n = new Art(title, medium, imgFull, imgComp, type, category, height, width, feature);
        artRepo.save(n);
        return "Saved";
    }

    @PostMapping(path="/delete")
    public @ResponseBody String deleteArt(@RequestParam Integer id) {
        if (id == 0) artRepo.deleteAll();
        else artRepo.deleteById(id);
        return "Deleted";
    }

    @GetMapping
    public String getAttributes(Model model) {
        Iterable<Project> projects = projectRepo.findAll();
        model.addAttribute("projects", projects);
        Iterable<Art> arts = artRepo.findAll();
        model.addAttribute("arts", arts);
        return "art";
    }
}

/*

add entry to DB:
  Template:
    curl http://localhost:8080/art/add -d title=x -d medium=x -d img=x -d type=x -d category=x -d height=x -d width=x -d feature=x
  Test Image
    curl http://localhost:8080/art/add -d "title=Test Image" -d medium=screenshot -d img=testImg -d "type=print screen" -d category=digital -d height=750 -d width=631 -d feature=True



*/
