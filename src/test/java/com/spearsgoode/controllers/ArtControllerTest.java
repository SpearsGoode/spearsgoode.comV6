package com.spearsgoode.controllers;

import com.spearsgoode.interfaces.ArtRepo;
import com.spearsgoode.interfaces.ProjectRepo;
import com.spearsgoode.models.Art;
import com.spearsgoode.models.Project;
import com.spearsgoode.security.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebMvcTest(ArtController.class)
@Import(SecurityConfig.class)
public class ArtControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProjectRepo projectRepo;
    @MockBean
    ArtRepo artRepo;

    @Test
    public void testArtPage() throws Exception {
        List<Project> projects = Arrays.asList(
                new Project("Project 1"),
                new Project("Project 2"),
                new Project("Project 3")
        );

        List<Art> allArt = Arrays.asList(
                new Art("a painting", "testMedium", "testImg.png", "testImg.png", "trad", "paint", 0, 0, false),
                new Art("a featured painting", "testMedium", "testImg.png", "testImg.png", "trad", "paint", 0, 0, true),
                new Art("a drawing", "testMedium", "testImg.png", "testImg.png", "trad", "draw", 0, 0, false),
                new Art("an other", "testMedium", "testImg.png", "testImg.png", "trad", "other", 0, 0, false),
                new Art("a logo", "testMedium", "testImg.png", "testImg.png", "digi", "logo", 0, 0, false),
                new Art("a cover", "testMedium", "testImg.png", "testImg.png", "digi", "cover", 0, 0, false)
        );

        // Set up the behavior of the projectRepo mock
        Mockito.when(projectRepo.findAll()).thenReturn(projects);

        // Set up the behavior of the artRepo mock
        Mockito.when(artRepo.findAll()).thenReturn(allArt);

        // Perform the GET request to "/art" and verify the response
        mockMvc.perform(MockMvcRequestBuilders.get("/art"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("art"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("projects"))
                .andExpect(MockMvcResultMatchers.model().attribute("projects", projects))
                .andExpect(MockMvcResultMatchers.model().attributeExists("paintings"))
                .andExpect(MockMvcResultMatchers.model().attribute("paintings", filterByCategory(allArt, "paint")))
                .andExpect(MockMvcResultMatchers.model().attributeExists("drawings"))
                .andExpect(MockMvcResultMatchers.model().attribute("drawings", filterByCategory(allArt, "draw")))
                .andExpect(MockMvcResultMatchers.model().attributeExists("others"))
                .andExpect(MockMvcResultMatchers.model().attribute("others", filterByCategory(allArt, "other")))
                .andExpect(MockMvcResultMatchers.model().attributeExists("logos"))
                .andExpect(MockMvcResultMatchers.model().attribute("logos", filterByCategory(allArt, "logo")))
                .andExpect(MockMvcResultMatchers.model().attributeExists("covers"))
                .andExpect(MockMvcResultMatchers.model().attribute("covers", filterByCategory(allArt, "cover")))
                .andExpect(MockMvcResultMatchers.model().attributeExists("featured"))
                .andExpect(MockMvcResultMatchers.model().attribute("featured", filterByFeature(allArt)));
    }

    private List<Art> filterByCategory(List<Art> allArt, String category) {
        List<Art> filteredList = new ArrayList<>();
        for (Art art : allArt) {
            if (art.getCategory().equals(category)) {
                filteredList.add(art);
            }
        }
        return filteredList;
    }

    private List<Art> filterByFeature(List<Art> allArt) {
        List<Art> filteredList = new ArrayList<>();
        for (Art art : allArt) {
            if (art.getFeature()) {
                filteredList.add(art);
            }
        }
        return filteredList;
    }
}