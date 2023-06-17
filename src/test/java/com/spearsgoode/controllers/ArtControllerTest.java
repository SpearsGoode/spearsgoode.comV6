package com.spearsgoode.controllers;

import com.spearsgoode.interfaces.ProjectRepo;
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

    @Test
    public void testArtPage() throws Exception {
        List<Project> projects = Arrays.asList(
                new Project("Project 1"),
                new Project("Project 2"),
                new Project("Project 3")
        );

        // Set up the behavior of the projectRepo mock
        Mockito.when(projectRepo.findAll()).thenReturn(projects);

        // Perform the GET request to "/art" and verify the response
        mockMvc.perform(MockMvcRequestBuilders.get("/art"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("art"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("projects"))
                .andExpect(MockMvcResultMatchers.model().attribute("projects", projects));
    }
}