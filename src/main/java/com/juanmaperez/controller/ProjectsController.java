package com.juanmaperez.controller;

import com.juanmaperez.model.Project;
import com.juanmaperez.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/projects")
@RestController
public class ProjectsController {

    private ProjectsService projectsService;

    @Autowired
    public ProjectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectsService.getAllProjects();
    }

    @PostMapping
    public Project insertProject(@RequestBody Project project) {
        return projectsService.insertProject(project);
    }
}
