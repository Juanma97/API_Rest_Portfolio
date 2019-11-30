package com.juanmaperez.api;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

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
    public void when_get_all_courses_should_return_all_courses_sucessfully () throws Exception {
        mockMvc.perform(
                get("/projects")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }
}
