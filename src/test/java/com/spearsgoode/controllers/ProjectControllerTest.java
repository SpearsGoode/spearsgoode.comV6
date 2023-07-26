package com.spearsgoode.controllers;

import com.spearsgoode.controllers.security.WithMockAdmin;
import com.spearsgoode.security.SecurityConfig;
import com.spearsgoode.interfaces.ProjectRepo;
import com.spearsgoode.models.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ProjectController.class)
@Import(SecurityConfig.class)
public class ProjectControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProjectRepo projectRepo;

    @Test
    public void testGetProjects() throws Exception {
        Project project1 = new Project();
        project1.setId(1);
        project1.setTitle("Project 1");

        Project project2 = new Project();
        project2.setId(2);
        project2.setTitle("Project 2");

        when(projectRepo.findAll()).thenReturn(Arrays.asList(project1, project2));

        mockMvc.perform(get("/projects"))
                .andExpect(status().isOk())
                .andExpect(view().name("projects"))
                .andExpect(model().attribute("projects", hasSize(2)));
    }

    @Test
    @WithMockAdmin
    public void testAddNewProject() throws Exception {
        // Configure the behavior of the projectRepo mock
        when(projectRepo.save(any(Project.class))).thenReturn(new Project());

        // Perform the POST request
        mockMvc.perform(post("/projects/add")
                .param("title", "New Project")
                .param("tag", "new-project")
                .param("date", "2023-05-12")
                .param("img", "image.jpg")
                .param("alt", "New project image")
                .param("link", "https://example.com")
                .param("intro", "Intro text")
                .param("info", "Project information")
                .with(csrf()))
                .andExpect(status().isOk())
                .andExpect(content().string("Saved"));

        // Verify that the save method was called with the expected project object
        verify(projectRepo).save(any(Project.class));
    }

    @Test
    @WithMockAdmin
    public void testDeleteProject() throws Exception {
        doNothing().when(projectRepo).deleteById(1);

        mockMvc.perform(post("/projects/delete")
                .param("id", "1")
                .with(csrf()))
                .andExpect(status().isOk())
                .andExpect(content().string("Deleted"));
    }
}