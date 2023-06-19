package com.spearsgoode.controllers;

import com.spearsgoode.interfaces.ArtRepo;
import com.spearsgoode.interfaces.ProjectRepo;
import com.spearsgoode.models.Art;
import com.spearsgoode.models.Project;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

@WebMvcTest(ArtController.class)
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

        List<Art> artList = Arrays.asList(
                new Art("Art 1"),
                new Art("Art 2"),
                new Art("Art 3")
        );

        // Set up the behavior of the projectRepo mock
        Mockito.when(projectRepo.findAll()).thenReturn(projects);

        // Set up the behavior of the artRepo mock
        Mockito.when(artRepo.findAll()).thenReturn(artList);

        // Perform the GET request to "/art" and verify the response
        mockMvc.perform(MockMvcRequestBuilders.get("/art"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("art"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("projects"))
                .andExpect(MockMvcResultMatchers.model().attribute("projects", projects))
                .andExpect(MockMvcResultMatchers.model().attributeExists("arts"))
                .andExpect(MockMvcResultMatchers.model().attribute("arts", artList));
    }
}