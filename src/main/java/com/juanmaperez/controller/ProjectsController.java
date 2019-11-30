package com.juanmaperez.controller;

import com.juanmaperez.model.Project;
import com.juanmaperez.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/projects")
@RestController
public class ProjectsController {

    @Autowired
    private ProjectsService projectsService;

    @Autowired
    public ProjectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectsService.getAllProjects();
    }
}
