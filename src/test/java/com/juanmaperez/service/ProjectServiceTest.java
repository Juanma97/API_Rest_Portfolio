package com.juanmaperez.service;

import com.juanmaperez.TestUtils;
import com.juanmaperez.model.Project;
import com.juanmaperez.repository.ProjectRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ProjectServiceTest {

    @Mock
    private ProjectRepository projectRepositoryMOCK;

    private ProjectsService projectsServiceSUT;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        projectsServiceSUT = new ProjectsService(projectRepositoryMOCK);
    }

    @Test
    public void when_get_all_courses_shoul_call_repository_and_return_all_courses () {
        List<Project> expected = TestUtils.generateProjects(5);
        doReturn(expected).when(projectRepositoryMOCK).findAll();

        List<Project> actual = projectsServiceSUT.getAllProjects();
        verify(projectRepositoryMOCK, times(1)).findAll();

        assertEquals(expected, actual);
    }
}
