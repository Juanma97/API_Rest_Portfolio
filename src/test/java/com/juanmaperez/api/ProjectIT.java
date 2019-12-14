package com.juanmaperez.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.juanmaperez.model.Project;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
@Transactional
public class ProjectIT {

    @Autowired
    public MockMvc mockMvc;

    @Before
    public void setup() {

    }

    @Test
    public void when_get_all_projects_should_return_all_projects_sucessfully() throws Exception {
        mockMvc.perform(
                get("/projects")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void when_insert_a_project_should_return_the_project_sucessfully() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Project project = new Project("P1", "D1", "github", "playstore", null, null, null, null);

        mockMvc.perform(
                post("/projects")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(project))
        ).andExpect(status().isOk());
    }

    @Test
    public void when_update_a_project_should_return_the_project_sucessfully() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        Project project = new Project(5L,"P1-UPDATED-IT", "D1", "github", "playstore", null, null, null, null);

        mockMvc.perform(
                put("/projects")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(project))
        ).andExpect(status().isOk());
    }
}
