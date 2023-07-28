package com.spearsgoode.controllers;

import com.spearsgoode.controllers.security.WithMockAdmin;
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
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;

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
        // Set up sample projects
        List<Project> projects = Arrays.asList(
                new Project("Project 1"),
                new Project("Project 2"),
                new Project("Project 3")
        );

        // Set up sample art with different categories and features
        List<Art> allArt = Arrays.asList(
                new Art("a painting", "testMedium", "testImg.png", "testImg.png", "trad", "paint", 0, 0, false),
                new Art("a featured painting", "testMedium", "testImg.png", "testImg.png", "trad", "paint", 0, 0, true),
                new Art("a drawing", "testMedium", "testImg.png", "testImg.png", "trad", "draw", 0, 0, false),
                new Art("an other", "testMedium", "testImg.png", "testImg.png", "trad", "other", 0, 0, false),
                new Art("a logo", "testMedium", "testImg.png", "testImg.png", "digi", "logo", 0, 0, false),
                new Art("a cover", "testMedium", "testImg.png", "testImg.png", "digi", "cover", 0, 0, false)
        );

        // Mock the behavior of art/projectRepo.findAll() to return the test art/projects
        Mockito.when(projectRepo.findAll()).thenReturn(projects);
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

    @Test
    @WithMockAdmin
    public void testAddNewArtAdmin() throws Exception {
        // Configure the behavior of the artRepo mock to return a new Art instance
        Mockito.when(artRepo.save(Mockito.any(Art.class))).thenReturn(new Art());

        // Perform a POST request to "/art/add" and verify the response
        mockMvc.perform(MockMvcRequestBuilders.post("/art/add")
                .param("title", "New Art")
                .param("medium", "Oil on canvas")
                .param("imgFull", "new-art.jpg")
                .param("imgComp", "new-art-comp.jpg")
                .param("type", "Traditional")
                .param("category", "Painting")
                .param("height", "30.0")
                .param("width", "40.0")
                .param("feature", "false")
                .with(csrf()))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Saved"));

        // Verify that the save method was called with the correct parameters
        Mockito.verify(artRepo, Mockito.times(1)).save(Mockito.any(Art.class));
    }

    @Test
    @WithMockAdmin
    public void testDeleteArtAdmin() throws Exception {
        // Perform the POST request to "/art/delete" and verify the response
        mockMvc.perform(MockMvcRequestBuilders.post("/art/delete")
                .param("id", "1")
                .with(csrf()))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Deleted"));

        // Verify that the artRepo deleteById method was called with the correct parameter
        Mockito.verify(artRepo, Mockito.times(1)).deleteById(1);
    }

    @Test
    @WithMockUser
    public void testAddNewArtUser() throws Exception {
        // Perform a POST request to "/art/add" and verify the response
        mockMvc.perform(MockMvcRequestBuilders.post("/art/add")
                .param("title", "New Art")
                .param("medium", "Oil on canvas")
                .param("imgFull", "new-art.jpg")
                .param("imgComp", "new-art-comp.jpg")
                .param("type", "Traditional")
                .param("category", "Painting")
                .param("height", "30.0")
                .param("width", "40.0")
                .param("feature", "false")
                .with(csrf()))
                .andExpect(MockMvcResultMatchers.status().isForbidden());
        // Since @WithMockUser does not have admin privileges, the request is expected to be forbidden
        // The test expects an HTTP 403 Forbidden status
    }

    @Test
    @WithMockUser
    public void testDeleteArtUser() throws Exception {
        // Perform the POST request to "/art/delete" and verify the response
        mockMvc.perform(MockMvcRequestBuilders.post("/art/delete")
                .param("id", "1")
                .with(csrf()))
                .andExpect(MockMvcResultMatchers.status().isForbidden());
        // Since @WithMockUser does not have admin privileges, the request is expected to be forbidden
        // The test expects an HTTP 403 Forbidden status
    }

    @Test
    public void testAddNewArt() throws Exception {
        // Perform a POST request to "/art/add" and verify the response
        mockMvc.perform(MockMvcRequestBuilders.post("/art/add")
                .param("title", "New Art")
                .param("medium", "Oil on canvas")
                .param("imgFull", "new-art.jpg")
                .param("imgComp", "new-art-comp.jpg")
                .param("type", "Traditional")
                .param("category", "Painting")
                .param("height", "30.0")
                .param("width", "40.0")
                .param("feature", "false")
                .with(csrf()))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.redirectedUrlPattern("**/login"));
                // Verify that the redirect URL is the login page
    }

    @Test
    public void testDeleteArt() throws Exception {
        // Perform the POST request to "/art/delete" and verify the response
        mockMvc.perform(MockMvcRequestBuilders.post("/art/delete")
                .param("id", "1")
                .with(csrf()))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.redirectedUrlPattern("**/login"));
                // Verify that the redirect URL is the login page
    }

    /* -----------------
      Private Functions
    */

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