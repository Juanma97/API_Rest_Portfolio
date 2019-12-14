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
    public void when_get_all_projects_shoul_call_repository_and_return_all_projects() {
        List<Project> expected = TestUtils.generateProjects(5);
        doReturn(expected).when(projectRepositoryMOCK).findAll();

        List<Project> actual = projectsServiceSUT.getAllProjects();
        verify(projectRepositoryMOCK, times(1)).findAll();

        assertEquals(expected, actual);
    }

    @Test
    public void when_insert_a_project_should_call_repository_and_return_the_project() {
        Project expected = new Project("P1", "D1", "github", "playstore", null, null, null, null);
        doReturn(expected).when(projectRepositoryMOCK).save(expected);

        Project actual = projectsServiceSUT.insertProject(expected);
        verify(projectRepositoryMOCK, times(1)).save(expected);

        assertEquals(expected, actual);
    }

    @Test
    public void when_update_a_project_should_call_repository_and_return_the_project_updated() {
        Project expected = new Project(5L, "P-UPDATED", "D1", "github", "playstore", null, null, null, null);
        doReturn(expected).when(projectRepositoryMOCK).save(expected);

        Project actual = projectsServiceSUT.updateProject(expected);
        verify(projectRepositoryMOCK, times(1)).save(expected);

        assertEquals(expected, actual);
    }
}
