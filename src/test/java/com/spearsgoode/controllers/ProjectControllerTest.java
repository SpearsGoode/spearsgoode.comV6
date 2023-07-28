package com.spearsgoode.controllers;

import com.spearsgoode.controllers.security.WithMockAdmin;
import com.spearsgoode.security.SecurityConfig;
import com.spearsgoode.interfaces.ProjectRepo;
import com.spearsgoode.models.Project;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
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
        // Set up sample projects
        Project project1 = new Project();
        project1.setId(1);
        project1.setTitle("Project 1");

        Project project2 = new Project();
        project2.setId(2);
        project2.setTitle("Project 2");

        // Mock the behavior of projectRepo.findAll() to return the test projects
        when(projectRepo.findAll()).thenReturn(Arrays.asList(project1, project2));

        // Perform a GET request to "/projects" and verify the expected behavior
        mockMvc.perform(get("/projects"))
                .andExpect(status().isOk())
                .andExpect(view().name("projects"))
                .andExpect(model().attribute("projects", hasSize(2)));
    }

    @Test
    @WithMockAdmin
    public void testAddNewProjectAdmin() throws Exception {
        // Configure the behavior of the projectRepo mock to return a new Project instance
        when(projectRepo.save(any(Project.class))).thenReturn(new Project());

        // Perform a POST request to "/projects/add" and verify the response
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

        // Verify that the save method was called with the correct parameters
        verify(projectRepo).save(any(Project.class));
    }

    @Test
    @WithMockAdmin
    public void testDeleteProjectAdmin() throws Exception {
        // Perform a POST request to "/projects/delete" with the "id" parameter and CSRF token
        mockMvc.perform(post("/projects/delete")
                .param("id", "1")
                .with(csrf()))
                .andExpect(status().isOk())
                .andExpect(content().string("Deleted"));

        // Verify that the projectRepo deleteById method was called with the correct parameter
        Mockito.verify(projectRepo, Mockito.times(1)).deleteById(1);
    }

    @Test
    @WithMockUser
    public void testAddNewProjectUser() throws Exception {
        // Perform a POST request to "/projects/add" and verify the response
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
                .andExpect(status().isForbidden());
        // Since @WithMockUser does not have admin privileges, the request is expected to be forbidden
        // The test expects an HTTP 403 Forbidden status
    }

    @Test
    @WithMockUser
    public void testDeleteProjectUser() throws Exception {
        // Perform the POST request to "/projects/delete" with the "id" parameter and CSRF token
        mockMvc.perform(post("/projects/delete")
                .param("id", "1")
                .with(csrf()))
                .andExpect(status().isForbidden());
        // Since @WithMockUser does not have admin privileges, the request is expected to be forbidden
        // The test expects an HTTP 403 Forbidden status
    }

    @Test
    public void testAddNewProject() throws Exception {
        // Perform a POST request to "/projects/add" and verify the response
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
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrlPattern("**/login"));
                // Verify that the redirect URL is the login page
    }

    @Test
    public void testDeleteProject() throws Exception {
        // Perform the POST request to "/projects/delete" with the "id" parameter and CSRF token
        mockMvc.perform(post("/projects/delete")
                .param("id", "1")
                .with(csrf()))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrlPattern("**/login"));
                // Verify that the redirect URL is the login page
    }

}