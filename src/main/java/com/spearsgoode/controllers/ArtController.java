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
            @RequestParam String link,
            @RequestParam String type,
            @RequestParam String category,
            @RequestParam Double height,
            @RequestParam Double width,
            @RequestParam Boolean feature) {

        Art n = new Art(title, medium, link, type, category, height, width, feature);
        artRepo.save(n);
        return "Saved";
    }

    @PostMapping(path="/delete")
    public @ResponseBody String deleteArt(@RequestParam Integer id) {
        artRepo.deleteById(id);
        return "Deleted";
    }

    @GetMapping
    public String Projects(Model model) {
        Iterable<Project> projects = projectRepo.findAll();
        model.addAttribute("projects", projects);
        Iterable<Art> art = artRepo.findAll();
        model.addAttribute("art", art);
        return "art";
    }
}
