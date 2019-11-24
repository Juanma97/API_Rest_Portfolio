package com.juanmaperez.controller;

import com.juanmaperez.model.Project;
import com.juanmaperez.service.ProjectsService;

import java.util.List;

public class ProjectsController {

    private ProjectsService projectsService;

    public ProjectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    public List<Project> getAllProjects() {
        return projectsService.getAllProjects();
    }
}
