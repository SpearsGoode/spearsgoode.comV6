package com.spearsgoode.controllers;

import com.spearsgoode.interfaces.ProjectRepo;
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

import java.util.Arrays;
import java.util.List;

@WebMvcTest(HomeController.class)
@Import(SecurityConfig.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProjectRepo projectRepo;

    @Test
    public void testHomePage() throws Exception {
        List<Project> projects = Arrays.asList(
                new Project("Project 1"),
                new Project("Project 2"),
                new Project("Project 3")
        );

        // Mock the behavior of the projectRepo.findAll() method
        Mockito.when(projectRepo.findAll()).thenReturn(projects);

        // Perform the GET request to "/home" and verify the response
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("home"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("projects"))
                .andExpect(MockMvcResultMatchers.model().attribute("projects", projects));
    }
}