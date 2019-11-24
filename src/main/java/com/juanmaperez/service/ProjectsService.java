package com.juanmaperez.service;

import com.juanmaperez.model.Project;
import com.juanmaperez.repository.ProjectRepository;

import java.util.List;

public class ProjectsService {

    private ProjectRepository projectRepository;

    public ProjectsService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}
