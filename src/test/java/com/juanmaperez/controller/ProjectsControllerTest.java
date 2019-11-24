package com.juanmaperez.controller;

import com.juanmaperez.TestUtils;
import com.juanmaperez.model.Project;
import com.juanmaperez.service.ProjectsService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ProjectsControllerTest {

    @Mock
    private ProjectsService projectsServiceMOCK;

    private ProjectsController projectsControllerSUT;

    @Before
    public void setup () {
        MockitoAnnotations.initMocks(this);
        projectsControllerSUT = new ProjectsController(projectsServiceMOCK);
    }

    @Test
    public void when_get_all_projects_should_call_service_and_return_all_projects () {
        List<Project> expected = TestUtils.generateProjects(5);
        doReturn(expected).when(projectsServiceMOCK).getAllProjects();

        List<Project> actual = projectsControllerSUT.getAllProjects();
        verify(projectsServiceMOCK, times(1)).getAllProjects();

        assertEquals(expected, actual);
    }

}
